package com.example.hw6;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

/**
 * The type Control panel.
 */
public class ControlPanel extends JPanel {
    /**
     * The .
     */
    static int i = 1;
    /**
     * The Frame.
     */
    final MainFrame frame;
    /**
     * The Exit btn.
     */
    JButton exitBtn = new JButton("Exit");
    /**
     * The Load btn.
     */
//create all buttons (Load, Exit, etc.)
    JButton loadBtn = new JButton("Load");
    /**
     * The Save btn.
     */
    JButton saveBtn = new JButton("Save");
    /**
     * The Reset btn.
     */
    JButton resetBtn=new JButton("Reset");
    /**
     * The Export btn.
     */
    JButton exportBtn=new JButton("Export");

    /**
     * Instantiates a new Control panel.
     *
     * @param frame the frame
     */
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {

        setLayout(new GridLayout(1, 4));
        add(exportBtn);
        add(loadBtn);
        add(saveBtn);
        add(resetBtn);
        add(exitBtn);
        resetBtn.addActionListener(this::resetGame);
        exitBtn.addActionListener(this::exitGame);
        loadBtn.addActionListener(this::loadGame);
        saveBtn.addActionListener(this::saveGame);
        exportBtn.addActionListener(this::exportGame);
    }

    private void exportGame(ActionEvent actionEvent) {
        try {
            File outputfile = new File("game" + i+".png");
            ImageIO.write(frame.canvas.image, "png", outputfile);
        } catch (IOException e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }

    private void resetGame(ActionEvent actionEvent) {
        frame.canvas.reset();


    }

    private void loadGame(ActionEvent actionEvent) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("savefile.ser"));
            frame.setGame((Game) in.readObject());
            frame.getGame().resetDrawingPanel(frame.canvas);
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void saveGame(ActionEvent actionEvent) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("savefile.ser"));
            out.writeObject(this.frame.getGame());
            out.writeObject(this.frame.canvas.frame.getGame());
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


    private void exitGame(ActionEvent e) {
        frame.dispose();
    }

}

