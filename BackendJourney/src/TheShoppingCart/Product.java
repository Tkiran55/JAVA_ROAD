package TheShoppingCart;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double calculatePrice(){
        return price;
    }
    public String getName() { return name; }
}
