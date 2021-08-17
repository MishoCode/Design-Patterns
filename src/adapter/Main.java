package adapter;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1500, 8000);
        TransportMachine transportMachine = new SportCar(250);

        TransportMachine carAdapter = new CarAdapter(plane);

        System.out.println("Max speed of the plane: " + plane.getMaxSpeed());
        System.out.println("Max flight altitude of the plane: " + plane.getMaxFlightAltitude());

        System.out.println("Max speed of the transport machine(a sport car): " + transportMachine.getMaxSpeed());
        System.out.println("Max speed of the plane(behaving like a car): " + carAdapter.getMaxSpeed());
    }
}
