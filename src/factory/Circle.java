package factory;

public class Circle implements Shape {
    public static final double PI = 3.14;

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }
}
