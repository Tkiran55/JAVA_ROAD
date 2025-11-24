package RecapWithChatGPT.Week1;

import java.util.Scanner;

public class ControlFlowBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Write a program to check if a number is even or odd
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number%2 == 0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //Write a program that prints numbers from 1 to 10 using:
        //for loop
        for(int i=1; i<=10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //while loop
        int j=1;
        while(j<=10){
            System.out.print(j + " ");
            j++;
        }

        System.out.println();


        //Ask a user for a number and:
        //print “positive”, “negative”, or “zero”
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num == 0){
            System.out.println("Zero");
        }else if(num>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative number");
        }

        //Use switch to print a month name (1–12)
        switch (num){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12-> System.out.println("December");
            default -> System.out.println("No Months");


        }
    }
}
