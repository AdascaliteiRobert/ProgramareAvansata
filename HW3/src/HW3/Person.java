package HW3;
import java.util.*;

/**
 * The type Person.
 */
class Person implements Comparable<Person>, Node {
    private String name;
    private Date birthDate;
    private Map<Node, String> relationships; // relationships to other persons or companies

    /**
     * Instantiates a new Person.
     *
     * @param name      the name
     * @param birthDate the birth date
     */
    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.relationships = new HashMap<>();
    }

    /**
     * Add relationship.
     *
     * @param node         the node
     * @param relationship the relationship
     */
    public void addRelationship(Node node, String relationship) {
        relationships.put(node, relationship);
    }

    /**
     * Gets relationship.
     *
     * @param node the node
     * @return the relationship
     */
    public String getRelationship(Node node) {
        return relationships.get(node);
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets birth date.
     *
     * @return the birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }
}