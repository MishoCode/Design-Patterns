package visitor;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 1.5);
        Shape triangle = new Triangle(13, 14, 15);
        Shape circle = new Circle(7);

        ShapePainter shapePainterVisitor = new ShapePainter("red");
        rectangle.accept(shapePainterVisitor);
        circle.accept(shapePainterVisitor);

        AreaCalculator areaCalculatorVisitor = new AreaCalculator();

        triangle.accept(areaCalculatorVisitor);
        System.out.println("The area of the triangle is: " + areaCalculatorVisitor.getArea());

        circle.accept(areaCalculatorVisitor);
        System.out.println("The area of the circle is: " + areaCalculatorVisitor.getArea());
    }
}
