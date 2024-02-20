import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize lists to hold data
            List<Animal> animals = new ArrayList<>();
            List<Location> locations = new ArrayList<>();
            List<Tree> trees = new ArrayList<>();

            // Create sample data
            animals.add(new Animal("Lion", "Mammal", 5));
            animals.add(new Animal("Eagle", "Bird", 3));
            locations.add(new Location("Forest", 50));
            locations.add(new Location("River", 0));
            trees.add(new Tree("Oak", 10, 15, locations.get(0)));
            trees.add(new Tree("Pine", 8, 12, locations.get(0)));

            // Save data to files
            DataStorage.saveAnimals(animals);
            DataStorage.saveLocations(locations);
            DataStorage.saveTrees(trees);

            // Load data from files
            List<Animal> loadedAnimals = DataStorage.loadAnimals();
            List<Location> loadedLocations = DataStorage.loadLocations();
            List<Tree> loadedTrees = DataStorage.loadTrees();

            // Display loaded data
            System.out.println("Loaded Animals:");
            for (Animal animal : loadedAnimals) {
                System.out.println(animal.getName() + " - " + animal.getSpecies() + " - Age: " + animal.getAge());
            }

            System.out.println("\nLoaded Locations:");
            for (Location location : loadedLocations) {
                System.out.println(location.getName() + " - Trees: " + location.getNumOfTrees());
            }

            System.out.println("\nLoaded Trees:");
            for (Tree tree : loadedTrees) {
                System.out.println(tree.getName() + " - Age: " + tree.getAge() + " - Root Depth: " + tree.getRootSystem().getDepth());
            }

            // Perform other actions (e.g., acquiring vehicles, searching for sponsors)
            // Add your additional functionalities here

            // Code that may throw exceptions
            // Creating instances of classes
            Location forest = new Location("Forest", 50);
            Tree oakTree = new Tree("Oak", 10, forest);
            RootSystem oakRootSystem = new RootSystem(15);
            oakTree.setRootSystem(oakRootSystem);
            Goods book = new Goods("Book", 20.0, GoodsCategory.BOOKS);
            Goods apple = new Goods("Apple", 1.0, GoodsCategory.FOOD);
            Charity<Goods> charity = new Charity<>(CharityType.HUMANITARIAN_AID);
            charity.addWork(new Work<>("Distribute Books", book));
            charity.addWork(new Work<>("Distribute Apples", apple));
            CharityContact charityContact = new CharityContact();
            charityContact.contactCharity();
            Vehicle truck = new Vehicle("Ford", "F150", 2023) {
                @Override
                public void drive() {
                    System.out.println("Truck is driving.");
                }
            };
            truck.addGoods("Warehouse", book);
            truck.addGoods("Warehouse", apple);
            truck.addAnimal("Farm", "Cow");

            // Displaying information
            System.out.println("Location: " + forest);
            System.out.println("Tree: " + oakTree.getName() + ", Age: " + oakTree.getAge() + ", Root Depth: " + oakTree.getRootSystem().getDepth());
            System.out.println("Charity Type: " + charity.getType());
            System.out.println("Charity Works:");
            for (Work<Goods> work : charity.getWorks()) {
                System.out.println("- " + work.getName() + ": " + work.getDetails().getName());
            }
            System.out.println("Truck: " + truck.getBrand() + " " + truck.getModel() + ", Year: " + truck.getYear());
            System.out.println("Goods in Truck:");
            for (Map.Entry<String, Set<Goods>> entry : truck.getGoods().entrySet()) {
                for (Goods good : entry.getValue()) {
                    System.out.println("- " + good.getName() + " (" + entry.getKey() + ")");
                }
            }
            System.out.println("Animals in Truck:");
            for (Map.Entry<String, Set<String>> entry : truck.getAnimals().entrySet()) {
                for (String animal : entry.getValue()) {
                    System.out.println("- " + animal + " (" + entry.getKey() + ")");
                }
            }

            // Performing actions
            oakTree.grow();
            truck.drive();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


