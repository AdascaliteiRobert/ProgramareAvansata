package com.example.lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * The type Config panel.
 */
public class ConfigPanel extends JPanel {
    /**
     * The Frame.
     */
    final MainFrame frame;
    /**
     * The Dots label.
     */
    JLabel dotsLabel, /**
     * The Lines label.
     */
    linesLabel;
    /**
     * The Dots spinner.
     */
    JSpinner dotsSpinner;
    /**
     * The Lines combo.
     */
    JComboBox linesCombo;
    /**
     * The Create button.
     */
    JButton createButton;

    /**
     * Instantiates a new Config panel.
     *
     * @param frame the frame
     */
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label and the spinner
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
        linesLabel = new JLabel("Probability for line:");

        linesCombo = new JComboBox<>();
        double[] numberLines = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1};
        for (double number : numberLines) {
            linesCombo.addItem(number);
        }
        createButton = new JButton("Create a new game");

        add(dotsLabel);
        add(dotsSpinner);
        add(linesLabel);
        add(linesCombo);
        add(createButton);
        createButton.addActionListener(this::createGame);


    }

    private void createGame(ActionEvent actionEvent) {
        frame.canvas.setNumVertices((int) dotsSpinner.getValue());
        frame.canvas.setEdgeProbability((double) linesCombo.getSelectedItem());
        frame.canvas.createBoard();


    }
}