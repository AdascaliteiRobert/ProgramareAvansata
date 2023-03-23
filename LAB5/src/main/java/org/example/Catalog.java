package org.example;
import java.util.*;
import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Catalog.
 */
class Catalog {
    private List<Document> documents;

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
    public List<Document> getDocuments() {
        return documents;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Document doc : documents) {
            sb.append(doc.getName()).append(" (").append(doc.getLocation()).append(")\n");
            Map<String, String> tags = doc.getTags();
            for (String name : tags.keySet()) {
                sb.append("    ").append(name).append(": ").append(tags.get(name)).append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
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
        documents = Arrays.asList(mapper.readValue(new File(fileName), Document[].class));
    }
}

