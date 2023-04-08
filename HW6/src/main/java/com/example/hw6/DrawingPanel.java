package com.example.hw6;

import com.example.hw6.Dot;
import com.example.hw6.Game;
import com.example.hw6.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * The type Drawing panel.
 */
public class DrawingPanel extends JPanel {
    /**
     * The No press.
     */
    int noPress = 0;
    /**
     * The Frame.
     */
    final MainFrame frame;
    /**
     * The constant W.
     */
    final static int W = 800, /**
     * The H.
     */
    H = 600;
    private int numVertices;
    private double edgeProbability;
    private int[] x, y;

    /**
     * The Image.
     */
    BufferedImage image;
    /**
     * The Graphics.
     */
    Graphics2D graphics; //the tools needed to draw in the image

    /**
     * Instantiates a new Drawing panel.
     *
     * @param frame the frame
     */
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        initPanel();
        createBoard();
    }

    private void initPanel() {
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                verifyPressedDot(x, y);
                repaint();
            }
        });
    }

    private boolean stillActive(Dot dot) {
        if (!dot.freeDots()) {
            graphics.setColor(Color.white);
            graphics.fillOval(dot.getX() - 5, dot.getY() - 5, 10, 10);
            repaint();
            return false;
        }
        return true;
    }

    private void verifyPressedDot(int x, int y) {
        Dot dot = frame.getGame().getBoard().getDotObj(x, y);
        if (dot != null) {
            if (stillActive(dot)) //verificam ca nodul ales mai are laturi libere
                if (noPress == 0) {  //daca este primul nod ales
                    graphics.setColor(Color.yellow);
                    graphics.fillOval(dot.getX() - 5, dot.getY() - 5, 10, 10);
                    repaint();
                    frame.getGame().getBoard().setSelected(dot);
                    dot.setSelected(true);
                    noPress = 1;
                } else { //daca e al doilea nod
                    int index = frame.getGame().getBoard().getDots().indexOf(dot);
                    if (frame.getGame().getBoard().getDots().get(index).verifyAdj(frame.getGame().getBoard().getSelected())) //verificam ca primul si al doilea nod sunt vecine
                        if (!dot.getAdjDots().get(frame.getGame().getBoard().getSelected()).equals(Color.cyan)) { //daca latura este deja luata
                            graphics.setColor(Color.white);
                            graphics.fillOval(dot.getX() - 5, dot.getY() - 5, 10, 10);
                            repaint();
                        } else { //daca latura este libera
                            dot.getAdjDots().put(frame.getGame().getBoard().getSelected(), frame.getGame().getCurrentPlayer().getColor()); //adaugam latura
                            frame.getGame().getBoard().getSelected().getAdjDots().put(dot, frame.getGame().getCurrentPlayer().getColor()); //adaugam
                            graphics.setColor(frame.getGame().getCurrentPlayer().getColor());
                            graphics.drawLine(dot.getX(), dot.getY(), frame.getGame().getBoard().getSelected().getX(), frame.getGame().getBoard().getSelected().getY()); //coloram
                            repaint();

                        }

                }


        }
    }

    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 800, 600);
    }

    /**
     * Create board.
     */
    final void createBoard() {
        noPress = 0;
        frame.getGame().getBoard().resetDots();
        frame.getGame().getBoard().resetLines();
        numVertices = (Integer) frame.configPanel.dotsSpinner.getValue();
        edgeProbability = (Double) frame.configPanel.linesCombo.getSelectedItem();
        createOffscreenImage();
        createVertices();
        drawLines();
        drawVertices();
        repaint();

    }

    private void createVertices() {
        int x0 = W / 2;
        int y0 = H / 2;
        int radius = H / 2 - 10;
        double alpha = 2 * Math.PI / numVertices;
        x = new int[numVertices];
        y = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            x[i] = x0 + (int) (radius * Math.cos(alpha * i));
            y[i] = y0 + (int) (radius * Math.sin(alpha * i));
            Dot d = new Dot(x[i], y[i]);
            frame.getGame().getBoard().addDot(d);
        }

    }

    private void drawLines() {
        graphics.setColor(Color.cyan);


        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {

                int dx = x[i] - x[j];
                int dy = y[i] - y[j];
                double distance = Math.sqrt(dx * dx + dy * dy);


                if (Math.random() < edgeProbability) {
                    graphics.drawLine(x[i], y[i], x[j], y[j]);
                    Line l = new Line(frame.getGame().getBoard().getDots().get(i), frame.getGame().getBoard().getDots().get(j));
                    frame.getGame().getBoard().addLine(l);

                    frame.getGame().getBoard().getDots().get(i).addAdjDot(frame.getGame().getBoard().getDots().get(j));
                    frame.getGame().getBoard().getDots().get(j).addAdjDot(frame.getGame().getBoard().getDots().get(i));
                }
            }
        }
    }


    private void drawVertices() {

        int radius = 5;
        graphics.setColor(Color.white);

        for (int i = 0; i < numVertices; i++) {

            graphics.fillOval(x[i] - radius, y[i] - radius, 2 * radius, 2 * radius);
        }


    }


    @Override
    public void update(Graphics g) {

    }


    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.drawImage(image, 0, 0, this);
    }

    /**
     * Gets num vertices.
     *
     * @return the num vertices
     */
    public int getNumVertices() {
        return numVertices;
    }

    /**
     * Sets num vertices.
     *
     * @param numVertices the num vertices
     */
    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    /**
     * Gets edge probability.
     *
     * @return the edge probability
     */
    public double getEdgeProbability() {
        return edgeProbability;
    }

    /**
     * Sets edge probability.
     *
     * @param edgeProbability the edge probability
     */
    public void setEdgeProbability(double edgeProbability) {
        this.edgeProbability = edgeProbability;
    }

    /**
     * Remake.
     *
     * @param dots the dots
     */
    public void remake(List<Dot> dots){
        graphics.setColor(Color.black);
        graphics.clearRect(0, 0, getWidth(), getHeight());
        repaint();
        for(int i=0;i<numVertices;i++)
        {
            x[i]=dots.get(i).getX();
            y[i]=dots.get(i).getY();
        }

        drawVertices();
        repaint();
        for(Dot dot:dots){
            for(Dot d: dot.getAdjDots().keySet()) {
                graphics.setColor(dot.getAdjDots().get(d));
                graphics.drawLine(dot.getX(), dot.getY(), d.getX(), d.getY());
                repaint();
            }
        }
    }

    /**
     * Reset.
     */
    public void reset() {
        for(Dot d:frame.getGame().getBoard().getDots())
            for(Dot dot: d.getAdjDots().keySet())
            {
                graphics.setColor(Color.cyan);
                graphics.drawLine(dot.getX(), dot.getY(), d.getX(), d.getY());
                repaint();
                dot.getAdjDots().put(d,Color.cyan);
                d.getAdjDots().put(dot,Color.cyan);
                dot.full=0;
                dot.setSelected(false);
            }

    }
}
