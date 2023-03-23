package org.example;

import java.util.List;

/**
 * The type Project.
 */
public class Project implements Comparable<Project> {
    private String name;

    /**
     * Instantiates a new Project.
     */
//private List<Student>
    public Project() {
    }

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

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Project p) {
        if (this == null || p == null) {
            System.out.println("One of the objects is null.");
            return 0;
        }
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                '}';
    }
}