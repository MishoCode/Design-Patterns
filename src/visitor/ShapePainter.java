package visitor;

public class ShapePainter implements Visitor {

    private String color;

    public ShapePainter(String color) {
        this.color = color;
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("The rectangle was painted " + color);
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("The triangle was painted " + color);
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("The circle was painted " + color);
    }
}
