package com.example.lab6;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

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
        add(exitBtn);
        add(loadBtn);
        add(saveBtn);
        exitBtn.addActionListener(this::exitGame);
        loadBtn.addActionListener(this::loadGame);
        saveBtn.addActionListener(this::saveGame);
    }

    private void loadGame(ActionEvent actionEvent) {
    }

    private void saveGame(ActionEvent actionEvent) {
        try {
            File outputfile = new File("game" + i+".png");
            ImageIO.write(frame.canvas.image, "png", outputfile);
        } catch (IOException e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }


    private void exitGame(ActionEvent e) {
        frame.dispose();
    }

}