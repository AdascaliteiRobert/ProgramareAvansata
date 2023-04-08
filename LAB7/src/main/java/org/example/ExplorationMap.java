package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Exploration map.
 */
public class ExplorationMap {
    private final Cell[][] matrix;

    /**
     * Instantiates a new Exploration map.
     *
     * @param n the n
     */
    public ExplorationMap(int n) {
        matrix = new Cell[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Cell();
            }
        }
    }

    /**
     * Visit boolean.
     *
     * @param row    the row
     * @param col    the col
     * @param robot  the robot
     * @param tokens the tokens
     * @return the boolean
     */
    public boolean visit(int row, int col, Robot robot, List<Token> tokens) {
        synchronized (matrix[row][col]) {
            if (!matrix[row][col].isVisited()) {
                matrix[row][col].setVisited(true);
                matrix[row][col].setTokens(tokens);
                System.out.println(robot.getName() + " visited cell [" + row + "][" + col + "]");
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return matrix.length;
    }

    /**
     * Gets n.
     *
     * @return the n
     */
    public int getN() {
        return matrix.length * matrix.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j].toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static class Cell {
        private boolean visited;
        private List<Token> tokens;

        /**
         * Instantiates a new Cell.
         */
        public Cell() {
            visited = false;
            tokens = new ArrayList<>();
        }

        /**
         * Is visited boolean.
         *
         * @return the boolean
         */
        public boolean isVisited() {
            return visited;
        }

        /**
         * Sets visited.
         *
         * @param visited the visited
         */
        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        /**
         * Gets tokens.
         *
         * @return the tokens
         */
        public List<Token> getTokens() {
            return tokens;
        }

        /**
         * Sets tokens.
         *
         * @param tokens the tokens
         */
        public void setTokens(List<Token> tokens) {
            this.tokens = tokens;
        }

        @Override
        public String toString() {
            return visited ? tokens.toString() : "[ ]";
        }
    }
}