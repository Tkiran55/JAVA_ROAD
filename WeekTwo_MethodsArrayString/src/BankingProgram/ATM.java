package BankingProgram;

import java.util.Scanner;

public class ATM {
    static double balance;


    public static void deposit(double amount){
        balance += amount;
        System.out.println(balance + " is added your balance.");

    }
    public static void withdraw(double amount){
        if(amount < 0){
            System.out.println("Please enter a valid amount greater than 0.");
        }else if(balance < amount){
            System.out.println("Not enough balance.");
        }else {
            balance -= amount;
            System.out.println(amount + " is deducted from your balance");
        }
    }
    public static void display(){
        System.out.printf("Your balance is: %.2f%n", balance);



    }
    public static void exit(){
        System.out.println("Thank you");
    }


    public static void main(String[] args) {

        System.out.println("You are in atm Machine menu.");
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while(isRunning) {
            System.out.println("1. Deposit 2. Withdraw 3. DisplayBalance 4. Exit");


            System.out.print("Choose a number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the amount to deposit: ");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                }
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    withdraw(amount);
                }
                case 3 -> display();
                case 4 -> {
                    exit();
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice, Please try again");
            }
        }
    }
}
