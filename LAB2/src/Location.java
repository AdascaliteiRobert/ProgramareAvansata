package src;
public class Location {
    private double coordX;
    private double coordY;
    private String name;
    private LocationType type;

    public Location(double coordX, double coordY, String name, LocationType type) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.name = name;
        this.type = type;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';

    }
}
