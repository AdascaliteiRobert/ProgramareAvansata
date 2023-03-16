package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Project.
 */
class Project implements Comparable<Project> {
    private String name;

    /**
     * Instantiates a new Project.
     *
     * @param name the name
     */
    public Project(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Project other) {
        return name.compareTo(other.name);
    }
}