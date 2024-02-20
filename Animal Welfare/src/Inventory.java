import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Inventory {
    private TreeMap<String, List<String>> inventory;

    public Inventory() {
        this.inventory = new TreeMap<>();
    }

    // Add animal needs to the inventory
    public void addAnimalNeeds(String animal, List<String> needs) {
        inventory.put(animal, needs);
    }

    // Get all needs for a specific animal
    public List<String> getAnimalNeeds(String animal) {
        return inventory.getOrDefault(animal, new ArrayList<>());
    }

    // Allocate needs for a specific animal and remove them from the inventory
    public List<String> allocateAnimalNeeds(String animal, int quantity) {
        List<String> availableNeeds = getAnimalNeeds(animal);
        List<String> allocatedNeeds = new ArrayList<>();

        // Deduct needs from the inventory
        for (int i = 0; i < quantity && i < availableNeeds.size(); i++) {
            allocatedNeeds.add(availableNeeds.get(i));
        }

        // Remove allocated needs from inventory
        availableNeeds.removeAll(allocatedNeeds);

        return allocatedNeeds;
    }

    // Add needs back to the inventory when they are no longer needed
    public void returnAnimalNeeds(String animal, List<String> returnedNeeds) {
        List<String> availableNeeds = inventory.getOrDefault(animal, new ArrayList<>());
        availableNeeds.addAll(returnedNeeds);
        inventory.put(animal, availableNeeds);
    }
}