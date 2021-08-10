package visitor;

public interface Visitor {

    void visit(Rectangle rectangle);

    void visit(Triangle triangle);

    void visit(Circle circle);
}
