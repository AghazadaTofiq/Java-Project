// RootSystem.java
public class RootSystem {
    private int depth;

    public RootSystem(int depth) {
        this.depth = depth;
    }

    public void absorbWater() {
        System.out.println("Root system is absorbing water.");
    }

    public int getDepth() {
        return depth;
    }
}
