package LAB3;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Person.
 */
class Person implements Comparable<Person>, Node {
    private String name;
    private List<Person> friends;
    private Company employer;

    /**
     * Instantiates a new Person.
     *
     * @param name the name
     */
    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    /**
     * Add friend.
     *
     * @param friend the friend
     */
    public void addFriend(Person friend) {
        friends.add(friend);
    }

    /**
     * Sets employer.
     *
     * @param employer the employer
     */
    public void setEmployer(Company employer) {
        this.employer = employer;
    }

    /**
     * Gets friends.
     *
     * @return the friends
     */
    public List<Person> getFriends() {
        return friends;
    }

    /**
     * Gets employer.
     *
     * @return the employer
     */
    public Company getEmployer() {
        return employer;
    }
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
