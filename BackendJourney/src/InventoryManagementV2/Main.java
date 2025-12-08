package InventoryManagementV2;

public class Main {
    public static void main(String[] args) {

        PhysicalProduct physicalProduct = new PhysicalProduct("Keyboard", 50, 10);
        DigitalProduct digitalProduct = new DigitalProduct("E-book", 10, "http://download.com/e-book321");

        System.out.println("Keyboard Total cost: $" + physicalProduct.calculatePrice());
        System.out.println("E-book Total cost: $" + digitalProduct.calculatePrice());

    }



}
