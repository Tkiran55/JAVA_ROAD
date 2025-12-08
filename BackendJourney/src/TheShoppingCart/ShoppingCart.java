package TheShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    public void addItem(Product p){
        cart.add(p);
        System.out.println(p.getName() + " added to cart");
    }


    public void removeItem(Product p){
        cart.remove(p);
        System.out.println(p.getName() + " removed from cart");
    }

    public double calculateTotal(){
        double total =0;
        for(Product p: cart){
            total += p.calculatePrice();
        }
        return total;

    }

    public void printReceipt() {
        System.out.println("\nYour Shopping Receipt");
        for(Product p : cart){
            System.out.println("- " + p.getName() + ": $" + p.calculatePrice());
        }
        System.out.println("---------------------");
        System.out.println("Grand Total: $" + calculateTotal());
    }
}
