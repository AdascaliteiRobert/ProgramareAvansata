package HW3;
import java.util.*;


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
        // create persons
        Programmer alice = new Programmer("Alice", new Date(2000, 1, 1), "Java");
        Designer bob = new Designer("Bob", new Date(2001, 2, 2), "Photoshop");
        Person carol = new Person("Carol", new Date(2002, 3, 3));

        // create companies
        Company company1 = new Company("Company 1");
        Company company2 = new Company("Company 2");

        // add employees to companies
        company1.addEmployee(alice, "programmer");
        company1.addEmployee(bob, "designer");
        company2.addEmployee(carol, "manager");
        alice.addRelationship(bob, "friends");        // create network
        Network network = new Network();
        network.addNode(alice);
        network.addNode(bob);
        network.addNode(company1);
        network.addNode(carol);
        network.addNode(company2);


        // print network
        network.printNetwork();
    }
}