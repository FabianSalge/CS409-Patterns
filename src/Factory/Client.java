package Factory;

// Client: Uses the factory to create products
public class Client {
    public static void main(String[] args) {
        // Creating a car using the CarFactory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();

        // Creating a bike using the BikeFactory
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.start();
        bike.stop();
    }
}
