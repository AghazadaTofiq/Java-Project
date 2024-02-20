public class Truck extends Vehicle {
    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the truck");
    }
}
