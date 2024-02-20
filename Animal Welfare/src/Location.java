import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Location implements Iterable<String>, Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int numOfTrees;
    private StringBuilder animalsFound;
    private List<String> animalsPut;
    private Tree[] trees;
    private List<String> landTypes;

    public Location(String name, int numOfTrees) {
        this.name = name;
        this.numOfTrees = numOfTrees;
        this.animalsFound = new StringBuilder();
        this.animalsPut = new ArrayList<>();
        this.trees = new Tree[numOfTrees]; // Default capacity
        this.landTypes = new ArrayList<>();
    }

    public void plantTree(Tree tree) {
        // Logic to plant a tree in this location
    }

    public void addAnimal(String animal) {
        if (animalsFound.length() > 0) {
            animalsFound.append(", ");
        }
        animalsFound.append(animal);

        animalsPut.add(animal);
    }

    public void addTree(Tree tree) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
                break;
            }
        }
    }

    public void addLandType(String landType) {
        landTypes.add(landType);
    }

    @Override
    public Iterator<String> iterator() {
        return animalsPut.iterator();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" (AnimalsPut: ");
        Iterator<String> iterator = animalsPut.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (iterator.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(")");

        if (animalsFound.length() > 0) {
            return name + " (AnimalsFound: " + animalsFound.toString() + ")"
                    + "\n" + stringBuilder.toString();
        } else {
            return name + "\n" + stringBuilder.toString();
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfTrees() {
        return numOfTrees;
    }

    public void setNumOfTrees(int numOfTrees) {
        this.numOfTrees = numOfTrees;
    }

    public Tree[] getTrees() {
        return trees;
    }

    public void setTrees(Tree[] trees) {
        this.trees = trees;
    }

    List<String> getLandTypes() {
        return landTypes;
    }

    void setLandTypes(List<String> landTypes) {
        this.landTypes = landTypes;
    }
}

