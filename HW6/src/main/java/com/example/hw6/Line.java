package com.example.hw6;

import java.awt.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * The type Line.
 */
public class Line implements Serializable {
    private Dot dot1;
    private Dot dot2;
    private Color color;
    private boolean selected;
    private Player player;

    /**
     * Instantiates a new Line.
     *
     * @param dot1 the dot 1
     * @param dot2 the dot 2
     */
    public Line(Dot dot1, Dot dot2) {
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.selected = false;
        this.player = null;
        this.color = Color.gray;
    }

    /**
     * Gets dot 1.
     *
     * @return the dot 1
     */
    public Dot getDot1() {
        return dot1;
    }

    /**
     * Sets dot 1.
     *
     * @param dot1 the dot 1
     */
    public void setDot1(Dot dot1) {
        this.dot1 = dot1;
    }

    /**
     * Gets dot 2.
     *
     * @return the dot 2
     */
    public Dot getDot2() {
        return dot2;
    }

    /**
     * Sets dot 2.
     *
     * @param dot2 the dot 2
     */
    public void setDot2(Dot dot2) {
        this.dot2 = dot2;
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

    /**
     * Is selected boolean.
     *
     * @return the boolean
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets selected.
     *
     * @param selected the selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return dot1.equals(line.dot1) && dot2.equals(line.dot2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dot1, dot2);
    }
}