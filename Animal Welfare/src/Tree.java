// Tree.java
public class Tree extends Plant {
    private RootSystem rootSystem;
    private Location location;

    // Constructor overloading
    public Tree(String name, int age, Location location) {
        super(name, age);
        this.rootSystem = new RootSystem(10); // Default depth
        this.location = location;
    }

    public Tree(String name, int age, int rootDepth, Location location) {
        super(name, age);
        this.rootSystem = new RootSystem(rootDepth);
        this.location = location;
    }

    // Method overriding
    @Override
    public void grow() {
        super.grow(); // Call the grow method of the superclass
        System.out.println("Tree is growing taller.");
    }

    // Encapsulation: Getter for rootSystem
    public RootSystem getRootSystem() {
        return rootSystem;
    }

    // Encapsulation: Setter for rootSystem
    public void setRootSystem(RootSystem rootSystem) {
        this.rootSystem = rootSystem;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
