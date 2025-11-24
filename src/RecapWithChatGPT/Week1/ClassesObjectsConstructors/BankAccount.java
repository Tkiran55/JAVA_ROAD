package RecapWithChatGPT.Week1.ClassesObjectsConstructors;

import java.util.Scanner;

public class BankAccount {
    double balance;

    Scanner sc = new Scanner(System.in);

    BankAccount(double balance){
        this.balance = balance;
    }

    void showBalance(){
        System.out.print("Your balance is: " + balance);
        System.out.println();
    }

    void deposit(){
        System.out.print("Deposit amount: ");
        double amt = sc.nextDouble();

        balance = balance + amt;
        showBalance();
    }

    void withdraw(){
        System.out.print("Withdraw amount: ");
        double amt = sc.nextDouble();

        if(balance < 0){
            System.out.println("Not enough balance.");
        }else{
            balance = balance - amt;
            showBalance();

        }
    }
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(0);
        bank.showBalance();
        bank.deposit();
        bank.withdraw();

    }
}
