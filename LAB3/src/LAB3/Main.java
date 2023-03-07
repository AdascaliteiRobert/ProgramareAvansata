package LAB3;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

        List<Node> nodes = new ArrayList<>();

        Person ana = new Person("Ana");
        Person andrei = new Person("Andrei");
        Person daniel = new Person("Daniel");
        Company maria = new Company("Maria");
        Company raluca = new Company("Raluca");

        ana.addFriend(andrei);
        ana.addFriend(daniel);
        andrei.addFriend(daniel);
        daniel.setEmployer(maria);
        ana.setEmployer(raluca);
        nodes.add(ana);
        nodes.add(andrei);
        nodes.add(daniel);
        nodes.add(maria);
        nodes.add(raluca);

        for (Node node : nodes) {
            System.out.println(node.getName());
        }
    }
}

