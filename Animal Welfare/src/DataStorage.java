import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    // File paths for saving and loading data
    private static final String ANIMALS_FILE = "animals.txt";
    private static final String LOCATIONS_FILE = "locations.ser";
    private static final String TREES_FILE = "trees.txt";

    // Save animals to file
    public static void saveAnimals(List<Animal> animals) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ANIMALS_FILE))) {
            for (Animal animal : animals) {
                writer.write(animal.getName() + "," + animal.getSpecies() + "," + animal.getAge());
                writer.newLine();
            }
            System.out.println("Animals data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while saving animals data: " + e.getMessage());
        }
    }

    // Load animals from file
    public static List<Animal> loadAnimals() {
        List<Animal> animals = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ANIMALS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String species = parts[1];
                int age = Integer.parseInt(parts[2]);
                animals.add(new Animal(name, species, age));
            }
            System.out.println("Animals data loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while loading animals data: " + e.getMessage());
        }
        return animals;
    }

    // Save locations to file using object serialization
    public static void saveLocations(List<Location> locations) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(LOCATIONS_FILE))) {
            oos.writeObject(locations);
            System.out.println("Locations data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while saving locations data: " + e.getMessage());
        }
    }

    // Load locations from file using object deserialization
    public static List<Location> loadLocations() {
        List<Location> locations = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(LOCATIONS_FILE))) {
            locations = (List<Location>) ois.readObject();
            System.out.println("Locations data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error occurred while loading locations data: " + e.getMessage());
        }
        return locations;
    }

    // Save trees to file using Java NIO
    public static void saveTrees(List<Tree> trees) {
        Path path = Paths.get(TREES_FILE);
        try {
            BufferedWriter writer = Files.newBufferedWriter(path);
            for (Tree tree : trees) {
                writer.write(tree.getName() + "," + tree.getAge() + "," + tree.getRootSystem().getDepth());
                writer.newLine();
            }
            writer.close();
            System.out.println("Trees data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while saving trees data: " + e.getMessage());
        }
    }

    // Load trees from file using Java NIO
    public static List<Tree> loadTrees() {
        List<Tree> trees = new ArrayList<>();
        Path path = Paths.get(TREES_FILE);
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                int rootDepth = Integer.parseInt(parts[2]);
                Location location = new Location(name, 0); // Dummy location for now
                Tree tree = new Tree(name, age, rootDepth, location);
                trees.add(tree);
            }
            reader.close();
            System.out.println("Trees data loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while loading trees data: " + e.getMessage());
        }
        return trees;
    }
}

