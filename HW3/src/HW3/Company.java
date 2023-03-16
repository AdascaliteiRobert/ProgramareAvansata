package HW3;
import java.util.*;

/**
 * The type Company.
 */
class Company implements Comparable<Company>, Node {
    private String name;
    private Map<Person, String> employees; // employees with their position in the company

    /**
     * Instantiates a new Company.
     *
     * @param name the name
     */
    public Company(String name) {
        this.name = name;
        this.employees = new HashMap<>();
    }

    /**
     * Add employee.
     *
     * @param employee the employee
     * @param position the position
     */
    public void addEmployee(Person employee, String position) {
        employees.put(employee, position);
        employee.addRelationship(this, position);
    }

    @Override
    public String getName() {
        return name;
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
    public int compareTo(Company other) {
        return name.compareTo(other.name);
    }
}