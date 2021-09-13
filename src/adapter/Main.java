package adapter;

public class Main {
    public static void main(String[] args) {
        Movable sportCar = new SportCar(280);
        System.out.println("Max speed in KMH: " + sportCar.getMaxSpeed());

        MovableAdapter kmhToMPHConverter = new SpeedConverter(sportCar);
        System.out.println("Max speed in MPH: " + kmhToMPHConverter.getMaxSpeed());
    }
}
