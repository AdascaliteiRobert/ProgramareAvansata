package HW3;
import java.util.*;

/**
 * The type Designer.
 */
class Designer extends Person {
    private String favoriteTool;

    /**
     * Instantiates a new Designer.
     *
     * @param name         the name
     * @param birthDate    the birth date
     * @param favoriteTool the favorite tool
     */
    public Designer(String name, Date birthDate, String favoriteTool) {
        super(name, birthDate);
        this.favoriteTool = favoriteTool;
    }

    /**
     * Gets favorite tool.
     *
     * @return the favorite tool
     */
    public String getFavoriteTool() {
        return favoriteTool;
    }
}