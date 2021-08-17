package adapter;

public class CityCar extends Car {
    public CityCar(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
