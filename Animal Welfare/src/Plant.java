// Plant.java
public class Plant {
    private String name;
    private int age;

    public Plant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void grow() {
        System.out.println(name + " is growing.");
    }

    // Getters and setters
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

}
