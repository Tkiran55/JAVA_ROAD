package Exception;

//Write a Java program that:
//Asks the user to enter two integers.
//Divides them and prints the result.
//If the user enters zero as the divisor, catch the exception and print a friendly message.
//Use a finally block to print “Calculation attempt finished.”

import java.util.Scanner;

public class ExceptionHandlingExe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int numOne = scanner.nextInt();

        System.out.print("Enter a Second number: ");
        int numTwo = scanner.nextInt();

        try{
            System.out.println("Question: " +numOne + "/" + numTwo);
            int result = numOne/numTwo;
            System.out.println("Answer: " + result);
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero.");
        }finally {
            System.out.println("Calculation attempt finished.");
        }
    }
}
