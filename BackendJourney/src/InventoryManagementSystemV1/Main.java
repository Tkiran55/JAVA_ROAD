package InventoryManagementSystemV1;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200, 5);
        Product mouse = new Product("Mouse", 700, 10);

        laptop.sell(3);
        mouse.sell(5);

        laptop.sell(5);

        laptop.restock(10);
        mouse.restock(10);


        System.out.println(laptop.getDetails());
        System.out.println(mouse.getDetails());

    }
}
