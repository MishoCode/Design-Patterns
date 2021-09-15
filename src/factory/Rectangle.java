package factory;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
