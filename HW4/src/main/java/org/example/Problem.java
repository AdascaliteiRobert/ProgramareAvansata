package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Problem.
 */
public class Problem {
    private Map<Student, List<Project>> prefMap = new HashMap<>();

    /**
     * Instantiates a new Problem.
     */
    public Problem() {
    }


    /**
     * Instantiates a new Problem.
     *
     * @param prefMap the pref map
     */
    public Problem(Map<Student, List<Project>> prefMap) {
        this.prefMap = prefMap;
    }

    /**
     * New key.
     *
     * @param s the s
     * @param p the p
     */
    public void newKey(Student s, List<Project> p) {
        prefMap.put(s, p);
    }

    /**
     * Gets low pref.
     */
    public void getLowPref() {
        double sum = prefMap.values().stream().mapToInt(List::size).average().orElse(0.0);
        prefMap.entrySet().stream().filter(entry -> entry.getValue().size() < sum).forEach(System.out::println);
    }

    /**
     * Gets pref map.
     *
     * @return the pref map
     */
    public Map<Student, List<Project>> getPrefMap() {
        return prefMap;
    }

    /**
     * Sets pref map.
     *
     * @param prefMap the pref map
     */
    public void setPrefMap(Map<Student, List<Project>> prefMap) {
        this.prefMap = prefMap;
    }

    @Override
    public String toString() {
        return "Problem{" + "prefMap=" + prefMap + '}';
    }
}