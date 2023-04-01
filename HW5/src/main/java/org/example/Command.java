package org.example;
import freemarker.template.TemplateException;
import java.io.IOException;

/**
 * The interface Command.
 */
public interface Command {
    /**
     * Execute.
     *
     * @throws CommandNotFoundException the command not found exception
     * @throws InvalidDataException     the invalid data exception
     * @throws IOException              the io exception
     * @throws TemplateException        the template exception
     */
    void execute() throws CommandNotFoundException, InvalidDataException, IOException, TemplateException;
}