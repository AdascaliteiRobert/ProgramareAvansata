public class Destination extends Location {
    public Destination(double coordX, double coordY, String name, LocationType type) {
        super(coordX, coordY, name, type);
    }

    @Override
    public String toString() {
        return " to go to the "+
                getType() + " " + getName() +
                " ( "+ getCoordX() + " , " +
                getCoordY() + " ) ";
    }
}

