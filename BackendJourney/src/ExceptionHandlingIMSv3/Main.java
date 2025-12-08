package ExceptionHandlingIMSv3;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200, 5);

        try {
            laptop.sell(10);
        } catch (OutOfStockException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        System.out.println(laptop.getDetails());


    }
}
