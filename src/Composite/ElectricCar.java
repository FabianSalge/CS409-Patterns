package Composite;

public class ElectricCar extends Car{
    @Override
    public void move(int x, int y, int z) {
        System.out.println(String.format("Electric Car Moves to:\n" +
                "x: %d\n" +
                "y: %d\n" +
                "z: %d\n", x, y, z));
    }
}
