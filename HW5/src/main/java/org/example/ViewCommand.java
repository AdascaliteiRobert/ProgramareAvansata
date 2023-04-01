package org.example;
import java.io.IOException;
import java.awt.*;
import java.io.File;

/**
 * The type View command.
 */
public class ViewCommand implements Command {
    private final String location;
    private IOException e;

    /**
     * Instantiates a new View command.
     *
     * @param location the location
     */
    public ViewCommand(String location) {
        this.location = location;
    }

    public void execute() throws InvalidDataException, CommandNotFoundException {
        if (!Desktop.isDesktopSupported()) {
            throw new CommandNotFoundException("View command not supported on this platform");
        }
        try {
            File file = new File(location);
            if (!file.exists()) {

                throw new InvalidDataException("Document not found: " + location, e);
            }
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            throw new InvalidDataException("Failed to open document: " + location, e);
        }
    }
}