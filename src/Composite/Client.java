package Composite;

public class Client {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle sedanCar = new Car();
        Vehicle sportsCar = new Car();
        Vehicle electricCar = new ElectricCar();
        Vehicle electricBike = new Bike();

        // Create composite objects to group vehicles
        CompositeVehicle sedanComposite = new CompositeVehicle();
        sedanComposite.add(sedanCar);

        CompositeVehicle sportsComposite = new CompositeVehicle();
        sportsComposite.add(sportsCar);

        CompositeVehicle electricComposite = new CompositeVehicle();
        electricComposite.add(electricCar);
        electricComposite.add(electricBike);

        CompositeVehicle mainComposite = new CompositeVehicle();
        mainComposite.add(sedanComposite);
        mainComposite.add(sportsComposite);
        mainComposite.add(electricComposite);

        // Moving individual vehicles
        sedanCar.move(10, 20, 0);
        sportsCar.move(5, 10, 0);
        electricCar.move(15, 30, 0);
        electricBike.move(10, 20, 0);

        // Moving the main composite, which moves all vehicles within its structure
        mainComposite.move(20, 40, 0);
    }
}
