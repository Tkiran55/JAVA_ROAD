package RecapWithChatGPt;

//Write a Java program that:
//Asks the user to enter two integers.
//Divides them and prints the result.
//If the user enters zero as the divisor, catch the exception and print a friendly message.
//Use a finally block to print “Calculation attempt finished.”

import java.util.Scanner;

public class L12ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int numTwo = scanner.nextInt();

        System.out.println("Dividing....");

        try {
            int result = numOne/numTwo;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }finally {
            System.out.println("Calculation attempt finished.");
        }


    }
}
