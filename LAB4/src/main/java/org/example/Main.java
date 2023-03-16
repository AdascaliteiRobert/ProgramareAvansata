package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Create students
        List<Student> students = Stream.of(
                        new Student("S0", Stream.of("P0", "P1", "P2").collect(Collectors.toSet())),
                        new Student("S1", Stream.of("P0", "P1").collect(Collectors.toSet())),
                        new Student("S2", Stream.of("P0").collect(Collectors.toSet())))
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));

        // Print students sorted by name
        System.out.println("Students:");
        students.forEach(System.out::println);

        // Create projects
        Set<Project> projects = Stream.of(
                        new Project("P0"),
                        new Project("P1"),
                        new Project("P2"))
                .collect(Collectors.toCollection(TreeSet::new));

        // Print projects sorted by name
        System.out.println("\nProjects:");
        projects.forEach(System.out::println);
    }
}
