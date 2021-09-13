package adapter;

public class SportCar implements Movable{
    private double maxSpeed;

    public SportCar(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}
