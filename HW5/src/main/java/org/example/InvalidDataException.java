package org.example;

/**
 * The type Invalid data exception.
 */
public class InvalidDataException extends Exception {
    /**
     * Instantiates a new Invalid data exception.
     *
     * @param message the message
     * @param e       the e
     */
    public InvalidDataException(String message, Exception e) {
        super(message);
    }
}