import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private Map<String, Set<String>> animals;
    private Map<String, Set<Goods>> goods;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.animals = new HashMap<>();
        this.goods = new HashMap<>();
    }

    // Abstract method to be implemented by subclasses
    public abstract void drive();

    public void addAnimal(String location, String animal) {
        animals.computeIfAbsent(location, k -> new HashSet<>()).add(animal);
    }

    public void addGoods(String location, Goods good) {
        goods.computeIfAbsent(location, k -> new HashSet<>()).add(good);
    }

    // Getters and setters
    public Map<String, Set<String>> getAnimals() {
        return animals;
    }

    public void setAnimals(Map<String, Set<String>> animals) {
        this.animals = animals;
    }

    public Map<String, Set<Goods>> getGoods() {
        return goods;
    }

    public void setGoods(Map<String, Set<Goods>> goods) {
        this.goods = goods;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }

}
