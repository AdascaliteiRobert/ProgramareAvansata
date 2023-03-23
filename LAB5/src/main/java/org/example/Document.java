package org.example;
import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Document.
 */
class Document {
    private String id;
    private String name;
    private String location;
    private Map<String, String> tags;

    /**
     * Instantiates a new Document.
     */
    public Document() {
        // default constructor
    }

    /**
     * Instantiates a new Document.
     *
     * @param id       the id
     * @param name     the name
     * @param location the location
     */
    public Document(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.tags = new HashMap<>();
    }

    /**
     * Add tag.
     *
     * @param name  the name
     * @param value the value
     */
    public void addTag(String name, String value) {
        tags.put(name, value);
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets tags.
     *
     * @return the tags
     */
    public Map<String, String> getTags() {
        return tags;
    }
}