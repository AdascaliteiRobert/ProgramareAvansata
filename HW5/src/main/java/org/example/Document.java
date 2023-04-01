package org.example;
import java.util.*;


/**
 * The type Document.
 */
public class Document {
    public String id;
    public String name;
    public String location;
    public Map<String, String> tags;

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
    public Document(String id, String name, String location, Map<String,String>tags) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.tags = tags;
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
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public  String  getId() {
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

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", tags=" + tags +
                '}';
    }
}