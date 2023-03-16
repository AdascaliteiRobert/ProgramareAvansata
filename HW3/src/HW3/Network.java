package HW3;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Network.
 */
class Network {
    private List<Node> nodes;

    /**
     * Instantiates a new Network.
     */
    public Network() {
        this.nodes = new ArrayList<>();
    }

    /**
     * Add node.
     *
     * @param node the node
     */
    public void addNode(Node node) {
        nodes.add(node);
    }

    /**
     * Gets node importance.
     *
     * @param node the node
     * @return the node importance
     */
    public int getNodeImportance(Node node) {
        int count = 0;
        for (Node other : nodes) {
            if (other != node) {
                if (other instanceof Person) {
                    Person person = (Person) other;
                    if (person.getRelationship(node) != null) {
                        count++;
                    }
                } else if (other instanceof Company) {
                    Company company = (Company) other;
                    if (company.getEmployees().containsKey(node)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * Print network.
     */
    public void printNetwork() {
        Collections.sort(nodes, new Comparator<Node>() {
            public int compare(Node n1, Node n2) {
                int imp1 = getNodeImportance(n1);
                int imp2 = getNodeImportance(n2);
                return Integer.compare(imp2, imp1);
            }
        });
        for (Node node : nodes) {
            System.out.println(node.getName() + " (" + getNodeImportance(node) + ")");
        }
    }
}



