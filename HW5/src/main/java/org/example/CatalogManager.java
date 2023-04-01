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
 * The type Catalog manager.
 */
public class CatalogManager {
    private Catalog catalog;
    private Configuration cfg;

    /**
     * Instantiates a new Catalog manager.
     */
    public CatalogManager() {
    }

    /**
     * Gets documents.
     *
     * @return the documents
     */
    public List<Document> getDocuments() {
        return catalog.getDocuments();
    }


    /**
     * Print catalog.
     */
    public void printCatalog() {
        System.out.println(catalog + " ");
    }

    /**
     * Load catalog.
     *
     * @param fileName the file name
     * @throws IOException the io exception
     */
    public void loadCatalog(String fileName) throws IOException {
        catalog.load(fileName);
    }

    /**
     * Save catalog.
     *
     * @param fileName the file name
     * @throws IOException the io exception
     */
    public void saveCatalog(String fileName) throws IOException {
        catalog.save(fileName);
    }
}