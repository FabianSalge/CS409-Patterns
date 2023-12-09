package Visitor;

public class Client {
    public static Shape[] list = {new Circle(), new Rectangle()};

    public static void main(String[] args){
        Visitor v1 = new FirstVisitor();
        for(int i = 0; i < list.length; i++){
            list[i].accept(v1);
        }
    }
}
