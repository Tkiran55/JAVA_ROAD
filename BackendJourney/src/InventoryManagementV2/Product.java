package InventoryManagementV2;

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
}
