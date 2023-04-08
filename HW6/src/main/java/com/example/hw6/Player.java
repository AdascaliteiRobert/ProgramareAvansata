package com.example.hw6;

import java.awt.*;
import java.io.Serializable;

/**
 * The type Player.
 */
public class Player implements Serializable {
    private String name;
    private Color color;


    /**
     * Instantiates a new Player.
     *
     * @param name  the name
     * @param color the color
     */
    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + name +
                '}';
    }
}

