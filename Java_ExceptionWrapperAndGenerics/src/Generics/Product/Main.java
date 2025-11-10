package Generics.Product;

public class Main {
    public static void main(String[] args) {
        // T is String (item name), U is Double (price)
        Product<String, Double> products = new Product<>("Apple", 2.55);

        // Retrieval is safe and requires no casting
        String name = products.getItem();
        Double cost = products.getPrice();

        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + cost);

    }
}
