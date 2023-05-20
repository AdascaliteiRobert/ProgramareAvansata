package compulsory.model;

/**
 * The type Player.
 */
public class Player {
    private String name;

    /**
     * Instantiates a new Player.
     */
    public Player(){

    }

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
