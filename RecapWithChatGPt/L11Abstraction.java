package RecapWithChatGPt;
//Abstraction means focusing on what an object does, not how it does it.
//In Java, we achieve abstraction using:
//1. Abstract classes, and
//2. Interfaces

public class L11Abstraction {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.processPayment();

        Payment p2 = new PayPalPayment();
        p2.processPayment();
    }
}

interface Payment{
    void processPayment();
}

class CreditCardPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Payment by CreditCard.");
    }
}

class PayPalPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Payment by PayPal.");
    }
}
