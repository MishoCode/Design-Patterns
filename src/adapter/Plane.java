package adapter;

public class Plane {
    private int maxSpeed;
    private int maxFlightAltitude;

    public Plane(int maxSpeed, int maxFlightAltitude) {
        this.maxSpeed = maxSpeed;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }
}
