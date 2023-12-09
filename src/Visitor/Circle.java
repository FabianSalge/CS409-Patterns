package Visitor;

public class Circle implements Shape{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String circleOperation(){
        return "Circle";
    }
}
