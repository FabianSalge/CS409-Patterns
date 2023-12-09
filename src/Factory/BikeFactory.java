package Factory;

// Concrete Creator: Implements the factory method to create specific vehicle
public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
