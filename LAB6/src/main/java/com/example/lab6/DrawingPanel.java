package com.example.lab6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * The type Drawing panel.
 */
public class DrawingPanel extends JPanel {
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
                //TODO...
                repaint();
            }
        });
    }

    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);
    }

    /**
     * Create board.
     */
    final void createBoard() {
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
        int y0 = H / 2; //middle of the board
        int radius = H / 2 - 10; //board radius
        double alpha = 2 * Math.PI / numVertices; // the angle
        x = new int[numVertices];
        y = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            x[i] = x0 + (int) (radius * Math.cos(alpha * i));
            y[i] = y0 + (int) (radius * Math.sin(alpha * i));
        }
    }

    private void drawLines() {
        int radius = 5; // radius of the circles
        graphics.setColor(Color.black);

        for (int i = 0; i < numVertices; i++) {

            graphics.fillOval(x[i] - radius, y[i] - radius, 2 * radius, 2 * radius);
        }
    }

    private void drawVertices() {

        graphics.setColor(Color.cyan);


        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {

                int dx = x[i] - x[j];
                int dy = y[i] - y[j];
                double distance = Math.sqrt(dx * dx + dy * dy);


                if (Math.random() < edgeProbability) {
                    graphics.drawLine(x[i], y[i], x[j], y[j]);
                }
            }
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
}
