package org.example;
import java.util.*;

/**
 * The type Token.
 */
public class Token {

    private final int number;

    /**
     * Instantiates a new Token.
     *
     * @param number the number
     */
    public Token(int number) {
        this.number = number;
    }

    /**
     * Gets number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Token{" +
                "number=" + number +
                '}';
    }
}