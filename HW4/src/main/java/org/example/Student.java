package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * The type Student.
 */
public class Student implements Comparable<Student> {
    private String name;

    private List<Project> projects = new ArrayList<>();

    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param name the name
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Instantiates a new Student.
     *
     * @param name               the name
     * @param admissibleProjects the admissible projects
     */
    public Student(String name, List<Project> admissibleProjects) {
        this.name = name;
        this.projects = admissibleProjects;
    }

    /**
     * Gets admissible projects.
     *
     * @return the admissible projects
     */
    public List<Project> getAdmissibleProjects() {
        return projects;
    }

    /**
     * Sets admissible projects.
     *
     * @param admissibleProjects the admissible projects
     */
    public void setAdmissibleProjects(List<Project> admissibleProjects) {
        this.projects = admissibleProjects;
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

    public int compareTo(Student s) {
        if (this == null || s == null) {
            System.out.println("One of the objects is null.");
            return 0;
        }

        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}