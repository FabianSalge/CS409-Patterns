package Visitor;

public class FirstVisitor implements Visitor{
    @Override
    public void visit(Circle c) {
        System.out.println("First visitor: " + c.circleOperation());
    }

    @Override
    public void visit(Rectangle r) {
        System.out.println("First visitor: " + r.rectangleOperation());
    }
}
