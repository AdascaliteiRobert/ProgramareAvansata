package org.example;
import java.util.*;
import java.io.*;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.awt.*;
import java.io.File;
import java.util.List;
/**
 * The type List command.
 */
public class LoadCommand implements Command {
    private final Catalog catalog;

    /**
     * Instantiates a new List command.
     *
     * @param catalog the catalog
     */
    public LoadCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        String fileName = new String();
        try {
            catalog.load(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}