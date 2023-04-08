package com.example.hw6;

import com.example.hw6.DrawingPanel;
import com.example.hw6.MainFrame;

import java.io.Serializable;

/**
 * The type Game.
 */
public class Game implements Serializable {

    private Board board;
    private Player currentPlayer;

    private Player winner;

    private Player player1, player2;


    /**
     * Instantiates a new Game.
     *
     * @param width   the width
     * @param height  the height
     * @param player1 the player 1
     * @param player2 the player 2
     */
    public Game(int width, int height, Player player1, Player player2) {

        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board(width, height);
        this.currentPlayer = player1;
        this.winner = null;
    }

    /**
     * Gets board.
     *
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Sets board.
     *
     * @param board the board
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Gets current player.
     *
     * @return the current player
     */
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Sets current player.
     *
     * @param currentPlayer the current player
     */
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    /**
     * Gets winner.
     *
     * @return the winner
     */
    public Player getWinner() {
        return winner;
    }

    /**
     * Sets winner.
     *
     * @param winner the winner
     */
    public void setWinner(Player winner) {
        this.winner = winner;
    }

    /**
     * Gets player 1.
     *
     * @return the player 1
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     * Sets player 1.
     *
     * @param player1 the player 1
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    /**
     * Gets player 2.
     *
     * @return the player 2
     */
    public Player getPlayer2() {
        return player2;
    }

    /**
     * Sets player 2.
     *
     * @param player2 the player 2
     */
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    /**
     * Triangle boolean.
     *
     * @param d1 the d 1
     * @param d2 the d 2
     * @return the boolean
     */
    public boolean triangle(Dot d1, Dot d2) {
        for (Dot dot : d1.getAdjDots().keySet())
            if (d1.getAdjDots().get(dot).equals(currentPlayer.getColor()))
                if (d2.getAdjDots().get(dot)!=null && d2.getAdjDots().get(dot).equals(currentPlayer.getColor()))
                    return true;
        return false;
    }

    /**
     * Finish boolean.
     *
     * @return the boolean
     */
    public boolean finish() {
        for (Dot dot : board.getDots())
            if (dot.freeDots())
                return false;
        return true;

    }


    /**
     * Reset drawing panel.
     *
     * @param drawingPanel the drawing panel
     */
    public void resetDrawingPanel(DrawingPanel drawingPanel) {
        drawingPanel.setNumVertices(board.getDots().size());
        drawingPanel.remake(board.getDots());

    }

}
