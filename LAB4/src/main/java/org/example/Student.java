package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Student.
 */
class Student implements Comparable<Student> {
    private String name;
    private Set<String> admissibleProjects;

    /**
     * Instantiates a new Student.
     *
     * @param name               the name
     * @param admissibleProjects the admissible projects
     */
    public Student(String name, Set<String> admissibleProjects) {
        this.name = name;
        this.admissibleProjects = admissibleProjects;
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
     * Gets admissible projects.
     *
     * @return the admissible projects
     */
    public Set<String> getAdmissibleProjects() {
        return admissibleProjects;
    }

    @Override
    public String toString() {
        return name + " " + admissibleProjects;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }
}