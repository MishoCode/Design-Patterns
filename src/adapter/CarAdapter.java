package adapter;

public class CarAdapter implements TransportMachine {

    //cars cannot fly, so we reduce the functionality only to getMaxSpeed()
    private Plane plane;

    public CarAdapter(Plane car) {
        this.plane = car;
    }

    @Override
    public int getMaxSpeed() {
        return plane.getMaxSpeed();
    }
}
