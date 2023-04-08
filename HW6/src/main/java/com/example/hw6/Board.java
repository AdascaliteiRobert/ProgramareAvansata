package com.example.hw6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Board.
 */
public class Board implements Serializable {
    /**
     * The Width.
     */
    int width;
    /**
     * The Height.
     */
    int height;
    private List<Dot> dots;
    private List<Line> lines;
    private Dot selected;

    /**
     * Instantiates a new Board.
     *
     * @param width  the width
     * @param height the height
     */
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.dots = new ArrayList<>();
        this.lines = new ArrayList<>();
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets dots.
     *
     * @return the dots
     */
    public List<Dot> getDots() {
        return dots;
    }

    /**
     * Sets dots.
     *
     * @param dots the dots
     */
    public void setDots(List<Dot> dots) {
        this.dots = dots;
    }

    /**
     * Gets lines.
     *
     * @return the lines
     */
    public List<Line> getLines() {
        return lines;
    }

    /**
     * Sets lines.
     *
     * @param lines the lines
     */
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    /**
     * Add dot.
     *
     * @param dot the dot
     */
    public void addDot(Dot dot) {
        dots.add(dot);
    }

    /**
     * Add line.
     *
     * @param line the line
     */
    public void addLine(Line line) {
        lines.add(line);
    }

    /**
     * Gets dot obj.
     *
     * @param x the x
     * @param y the y
     * @return the dot obj
     */
    public Dot getDotObj(double x, double y) {
        for (Dot dot : dots) {
            if (x >= dot.getX() - 10 && x <= dot.getX() + 10)
                if (y >= dot.getY() - 10 && y <= dot.getY() + 10) {
                    return dot;
                }
        }
        return null;
    }

    /**
     * Reset dots.
     */
    public void resetDots() {
        dots = new ArrayList<>();
    }

    /**
     * Reset lines.
     */
    public void resetLines() {
        lines = new ArrayList<>();
    }

    /**
     * Gets selected.
     *
     * @return the selected
     */
    public Dot getSelected() {
        return selected;
    }

    /**
     * Sets selected.
     *
     * @param selected the selected
     */
    public void setSelected(Dot selected) {
        this.selected = selected;
    }


}