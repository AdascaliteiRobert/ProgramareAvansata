package src;
public class StartingPoint extends Location {
    public StartingPoint(double coordX, double coordY, String name, LocationType type) {
        super(coordX, coordY, name, type);
    }

    @Override
    public String toString() {
        return "We are leaving the "+
                getType() + " " + getName() +
                " ( "+ getCoordX() +
                " , " + getCoordY() + " ) ";
    }
}
