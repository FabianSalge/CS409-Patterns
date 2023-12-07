package Composite;

public class Bike implements Vehicle{
    @Override
    public void move(int x, int y, int z) {
        System.out.println(String.format("Bike Moves to:\n" +
                "x: %d\n" +
                "y: %d\n" +
                "z: %d\n", x, y, z));
    }
}
