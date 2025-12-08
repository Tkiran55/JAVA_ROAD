package TheShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        PhysicalProduct keyboard = new PhysicalProduct("Keyboard", 50, 10);
        DigitalProduct ebook = new DigitalProduct("E-Book", 10, "http://download.com/ebook321");


        shoppingCart.addItem(keyboard);
        shoppingCart.addItem(ebook);

        System.out.println("Total: " + shoppingCart.calculateTotal());

        shoppingCart.printReceipt();
    }
}
