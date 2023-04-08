package org.example;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Robot.
 */
public class Robot implements Runnable {
    private String name;
    private boolean running;
    private Exploration exploration;

    /**
     * Instantiates a new Robot.
     *
     * @param name        the name
     * @param exploration the exploration
     */
    public Robot(String name, Exploration exploration) {
        this.name = name;
        this.exploration = exploration;
        running = true;
    }

    @Override
    public void run() {
        while (running) {
            // Pick a random cell to explore
            int row = (int) (Math.random() * exploration.getMap().getSize());
            int col = (int) (Math.random() * exploration.getMap().getSize());

            // Visit the cell and extract tokens
            List<Token> extractedTokens = exploration.getSharedMemory().extractTokens(exploration.getMap().getN());
            exploration.getMap().visit(row, col, this, extractedTokens);

            // Make the robot sleep for some time
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Stop.
     */
    public void stop() {
        running = false;
    }
}
