package adapter;

public abstract class Car implements TransportMachine {

    protected int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract int getMaxSpeed();
}
