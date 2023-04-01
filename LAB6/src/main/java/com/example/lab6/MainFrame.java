package com.example.lab6;
import javax.swing.*;

import static java.awt.BorderLayout.*;

/**
 * The type Main frame.
 */
public class MainFrame extends JFrame {
    /**
     * The Config panel.
     */
    ConfigPanel configPanel;
    /**
     * The Control panel.
     */
    ControlPanel controlPanel;
    /**
     * The Canvas.
     */
    DrawingPanel canvas;

    /**
     * Instantiates a new Main frame.
     */
    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //create the components
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);
        canvas = new DrawingPanel(this);


        add(canvas, CENTER);
        add(configPanel, NORTH);
        add(controlPanel, SOUTH);

        pack();
    }
}
