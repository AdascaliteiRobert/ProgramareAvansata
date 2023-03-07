package LAB3;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
 * The type Company.
 */
public class Company implements Node, Comparable<Company> {
    private String name;
    private Map<Person, String> employees;

    /**
     * Instantiates a new Company.
     *
     * @param name the name
     */
    public Company(String name) {
        this.name = name;
        employees = new HashMap<>();
    }

    /**
     * Hire.
     *
     * @param employee the employee
     * @param position the position
     */
    public void hire(Person employee, String position) {
        employees.put(employee, position);
    }

    /**
     * Gets employees.
     *
     * @return the employees
     */
    public Map<Person, String> getEmployees() {
        return employees;
    }

    @Override
    public int compareTo(Company o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String getName() {
        return name;
    }
}