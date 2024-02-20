public class Goods {
    private String name;
    private double price;
    private GoodsCategory category;

    // Constructor
    public Goods(String name, double price, GoodsCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and setters
    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public GoodsCategory getCategory() {
        return category;
    }
}

