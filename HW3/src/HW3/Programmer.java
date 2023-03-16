package HW3;
import java.util.*;

/**
 * The type Programmer.
 */
class Programmer extends Person {
    private String favoriteLanguage;

    /**
     * Instantiates a new Programmer.
     *
     * @param name             the name
     * @param birthDate        the birthdate
     * @param favoriteLanguage the favorite language
     */
    public Programmer(String name, Date birthDate, String favoriteLanguage) {
        super(name, birthDate);
        this.favoriteLanguage = favoriteLanguage;
    }

    /**
     * Gets favorite language.
     *
     * @return the favorite language
     */
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
}
