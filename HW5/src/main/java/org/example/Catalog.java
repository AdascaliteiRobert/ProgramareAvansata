package org.example;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Catalog.
 */
class Catalog {
    /**
     * The Documents.
     */
    ArrayList<Document> documents;

    /**
     * Instantiates a new Catalog.
     */
    public Catalog() {
        documents = new ArrayList<>();
    }

    /**
     * Add document.
     *
     * @param doc the doc
     */
    public void addDocument(Document doc) {
        documents.add(doc);
    }

    /**
     * Gets documents.
     *
     * @return the documents
     */
    public ArrayList<Document> getDocuments() {
        return documents;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "documents=" + documents +
                '}';
    }

    /**
     * Save.
     *
     * @param fileName the file name
     * @throws IOException the io exception
     */
    public void save(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), documents);
    }

    /**
     * Load.
     *
     * @param fileName the file name
     * @throws IOException the io exception
     */
    public void load(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(Paths.get("C:\\Users\\rokuf\\Desktop\\Robert.txt").toFile(), Catalog.class);
    }
}

