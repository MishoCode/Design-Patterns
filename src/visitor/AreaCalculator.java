package visitor;

public class AreaCalculator implements Visitor {
    private static final double PI = 3.14;

    private double area;

    public double getArea() {
        return area;
    }

    @Override
    public void visit(Rectangle rectangle) {
        area = rectangle.getLength() * rectangle.getWidth();
    }

    @Override
    public void visit(Triangle triangle) {
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double p = (a + b + c) / 2.0;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void visit(Circle circle) {
        area = PI * circle.getRadius() * circle.getRadius();
    }
}
