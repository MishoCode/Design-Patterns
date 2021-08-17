package adapter;

public class SportCar extends Car {

    public SportCar(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
