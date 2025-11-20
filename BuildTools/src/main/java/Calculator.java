import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter second number: ");
        int numTwo = scanner.nextInt();

        int sum = add(numOne, numTwo);
        System.out.println("The sum is " + sum);

        int diff = sub(numOne, numTwo);
        System.out.println("The difference is " + diff);
    }
}
