package com.example.hw6;
import javax.swing.*;

import java.awt.*;

import static java.awt.BorderLayout.*;

/**
 * The type Main frame.
 */
public class MainFrame extends JFrame {
    private Game game;
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
        Player player1=new Player("one", Color.blue);
        Player player2=new Player("one", Color.magenta);
        game = new Game(800, 600,player1,player2);
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

    /**
     * Gets game.
     *
     * @return the game
     */
    public Game getGame() {

        return game;
    }

    /**
     * Sets game.
     *
     * @param game the game
     */
    public void setGame(Game game) {
        this.game = game;
    }
}
