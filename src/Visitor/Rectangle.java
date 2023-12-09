package Visitor;

public class Rectangle implements Shape{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String rectangleOperation(){
        return "Rectangle";
    }
}
