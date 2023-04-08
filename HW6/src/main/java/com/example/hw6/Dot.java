package com.example.hw6;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Dot.
 */
public class Dot implements Serializable {
    private int x;
    private int y;
    private boolean selected;
    /**
     * The Full.
     */
    public int full=0;

    private Map<Dot, Color> adjDots = new HashMap<>();


    /**
     * Instantiates a new Dot.
     *
     * @param x the x
     * @param y the y
     */
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
        this.selected = false;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(int y) {
        this.y = y;
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
     * Verify adj boolean.
     *
     * @param d the d
     * @return the boolean
     */
    public boolean verifyAdj(Dot d) {
        for (Dot dot : adjDots.keySet()) {
            if (dot.equals(d))
                return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * Add adj dot.
     *
     * @param dot the dot
     */
    public void addAdjDot(Dot dot){
        adjDots.put(dot,Color.cyan);
    }


    /**
     * Free dots boolean.
     *
     * @return the boolean
     */
    public boolean freeDots(){
        if(adjDots.size()==full)
            return false;
        return true;
    }

    /**
     * Gets adj dots.
     *
     * @return the adj dots
     */
    public Map<Dot, Color> getAdjDots() {
        return adjDots;
    }

    /**
     * Sets adj dots.
     *
     * @param adjDots the adj dots
     */
    public void setAdjDots(Map<Dot, Color> adjDots) {
        this.adjDots = adjDots;
    }
}
