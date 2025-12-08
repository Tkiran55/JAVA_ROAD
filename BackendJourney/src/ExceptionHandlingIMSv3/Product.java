package ExceptionHandlingIMSv3;

public class Product {

    //fields
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDetails(){
        return name + " - Price: $" + price + ", Stock: " + quantity;
    }

    public void sell(int qty) throws OutOfStockException{
        if(qty > quantity){
            throw new OutOfStockException("Not enough items! Only " + quantity + " left ");
        }else{
        quantity -= qty;
            System.out.println(qty + " units of " + name  + " is sold.");
        }
    }

    public void restock(int qty){
        quantity += qty;
        System.out.println(qty + " units of " + name + " is restocked.");
    }
}
