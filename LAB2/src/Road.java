package src;
public class Road {
    private double lenght;
    private double speedLimit;
    private RoadType type;

    public Road(double lenght, double speedLimit, RoadType type) {
        this.lenght = lenght;
        this.speedLimit = speedLimit;
        this.type = type;
    }
    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "using a " + type +
                " road " + " with the speed limit " +
                speedLimit + " km/h "+
                " and the lenght " +
                lenght  + " km .";
    }
}

