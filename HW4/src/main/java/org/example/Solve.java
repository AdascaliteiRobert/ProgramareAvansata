package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Solve.
 */
public class Solve {
    private Problem pb;
    private Map<Student, Project> solution = new HashMap<>();
    private Map<Project, Boolean> availableProject = new HashMap<>();

    /**
     * Instantiates a new Solve.
     *
     * @param pb the pb
     */
    public Solve(Problem pb) {
        this.pb = pb;

        for (List<Project> p : pb.getPrefMap().values())
            for (Project pr : p) {
                availableProject.put(pr, false);
            }

    }

    /**
     * Greedy solve.
     */
    public void greedySolve() {
        for (Student s : pb.getPrefMap().keySet()) {
            int i = 0;
            while ( i < pb.getPrefMap().get(s).size() && availableProject.get(pb.getPrefMap().get(s).get(i))) {
                i++;
            }
            if (i < pb.getPrefMap().get(s).size()) {
                solution.put(s, pb.getPrefMap().get(s).get(i));
                availableProject.put(pb.getPrefMap().get(s).get(i), true);
            } else
                System.out.println("The algorithm didn't give a valid solution.");

        }

    }

    /**
     * Gets solution.
     *
     * @return the solution
     */
    public Map<Student, Project> getSolution() {
        return solution;
    }

    /**
     * Sets solution.
     *
     * @param solution the solution
     */
    public void setSolution(Map<Student, Project> solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "Solve{" +
                "solution=" + solution +
                '}';
    }

}