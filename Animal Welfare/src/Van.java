public class Van extends Vehicle {
    public Van(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the van");
    }
}

