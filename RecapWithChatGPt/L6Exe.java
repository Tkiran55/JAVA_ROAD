package RecapWithChatGPt;

public class L6Exe {
    public static void main(String[] args) {

        multiply(4,5);
        greet("Kiran");

    }

    public static void multiply(int numberOne, int numberTwo){
        System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne*numberTwo));
    }
    public static void greet(String name){
        System.out.println("Hello, " + name);
    }
}
