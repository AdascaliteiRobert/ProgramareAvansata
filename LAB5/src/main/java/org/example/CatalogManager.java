package org.example;

import java.util.*;
import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Catalog manager.
 */
class CatalogManager {
    private Catalog catalog;

    /**
     * Instantiates a new Catalog manager.
     */
    public CatalogManager() {
        catalog = new Catalog();
    }

    /**
     * Add document.
     *
     * @param id       the id
     * @param name     the name
     * @param location the location
     * @param tags     the tags
     */
    public void addDocument(String id, String name, String location, Map<String, String> tags) {
        Document doc = new Document(id, name, location);
        for (String nameTag : tags.keySet()) {
            doc.addTag(nameTag, tags.get(nameTag));
        }
        catalog.addDocument(doc);
    }

    /**
     * Print catalog.
     */
    public void printCatalog() {
        System.out.println(catalog);
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

    /**
     * Load catalog.
     *
     * @param fileName the file name
     * @throws IOException the io exception
     */
    public void loadCatalog(String fileName) throws IOException {
        catalog.load(fileName);
    }
}