package RecapWithChatGPT.Week1.Encapsulation;

//Create class BankAccount with:
//private balance
//private accountHolder
//setBalance() should not allow negative values

import java.util.Scanner;

//Methods:
//deposit(amount)
//withdraw(amount) (only if balance is enough)
public class BankAccount {
    private double balance;
    private final String accountHolder;

    BankAccount(double initBalance, String accountHolder){
        setBalance(initBalance);
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double newBalance){
        if(newBalance>=0){
            this.balance = newBalance;
        }else{
            System.out.println("No negative balance.");
        }

    }

    public boolean deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        }else{
            System.out.println("error");
            return false;
        }
    }

    public boolean withdraw(double amt){

        if(amt <= 0){
            System.out.println("Not enough balance./ No negative number");
            return false;
        }

        if(this.balance >= amt) {
            this.balance -= amt;
            return true;
        }
            else{

            System.out.println("Insufficient fund.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(500, "Hero");
        System.out.println("Bank Holder: " + bankAccount.getAccountHolder());
        System.out.println("Initial Balance: " + bankAccount.getBalance() ) ;

        System.out.println("Deposit: ");
        double amount = sc.nextDouble();

        if(bankAccount.deposit(amount)){
            System.out.println("New Balance: " + bankAccount.getBalance());
        }

        System.out.print("\nWithdraw amount: ");
        double withdrawAmt = sc.nextDouble();

        if (bankAccount.withdraw(withdrawAmt)) {
            System.out.println("Withdrawal successful. New Balance: " + bankAccount.getBalance());
        } else {
            System.out.println("Error");
        }



    }
}
