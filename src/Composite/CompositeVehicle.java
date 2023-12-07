package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeVehicle implements Vehicle{
    private List<Vehicle> vehicles = new ArrayList<>();

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void remove(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public void move(int x, int y, int z) {
        System.out.println("Moving all vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.move(x, y, z);
        }
    }
}
