package org.example;
import com.github.javafaker.Faker;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

        Faker faker=new Faker();
        Random random =new Random();
        var students= IntStream.rangeClosed(0, 4)
                .mapToObj(i -> new Student(faker.name().fullName()) )
                .toList();

        LinkedList<Student> studentList = new LinkedList<>(students);
        Collections.sort(studentList);
        System.out.println(studentList);
        var projects=IntStream.rangeClosed(0,5).mapToObj(i-> {
            System.out.println(i);
            return new Project(faker.animal().name());

        }).toList();
        TreeSet<Project> projectTreeSet = new TreeSet<>(projects);
        System.out.println(projectTreeSet);


        Problem pb=new Problem();
        pb.newKey(studentList.get(0),Arrays.asList(projects.get(0)));
        pb.newKey(studentList.get(1), Arrays.asList(projects.get(1)));
        pb.newKey(studentList.get(2), Arrays.asList(projects.get(2)));
        pb.newKey(studentList.get(3), Arrays.asList(projects.get(3)));
        pb.newKey(studentList.get(4), Arrays.asList(projects.get(4), projects.get(5)));
        pb.getLowPref();
        Solve sv=new Solve(pb);
        sv.greedySolve();
        System.out.println(sv);
    }

}