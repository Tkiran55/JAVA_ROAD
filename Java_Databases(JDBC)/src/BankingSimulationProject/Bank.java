package BankingSimulationProject;

import java.sql.SQLException;
import java.util.Scanner;

public class Bank {
    static int UserId = -1;
    static Scanner scanner = new Scanner(System.in);

    static BankManagement manage = new BankManagement();

    public static void main(String[] args) throws SQLException {

        System.out.println("====================================");
        System.out.println("-----Welcome To Bank-----");
        System.out.println("====================================");

        boolean isRunning = true;

        while(isRunning) {
            if(UserId == -1) {

                System.out.println("\n1. Create Account(For new Users only)");
                System.out.println("2. Login Account(For existing user");
                System.out.println("3. Exit");

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> handleCreateAccount();
                    case 2 -> handleLogin();
                    case 3 -> {
                        isRunning = false;
                        System.out.println("Exit");
                    }
                    default -> System.out.println("Invalid choice!");
                }

            }else{
                System.out.println("\n=== USER MENU ===");
                System.out.println("1. View Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer Money");
                System.out.println("5. Logout");
                System.out.print("\nChoose: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1 -> System.out.println("Balance: " + manage.getBalance(UserId));
                    case 2 -> handleDeposit();
                    case 3 -> handleWithdraw();
                    case 4 -> System.out.println("Soon...");
                    case 5 -> {
                        UserId = -1;
                        System.out.println("Logged Out!");
                    }
                    default -> System.out.println("Invalid Choice.");

                }


            }
        }
    }


    public static void handleCreateAccount() throws SQLException {
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if(manage.createAccount(username,password)){
            System.out.println("Account Created!");
        }else{
            System.out.println("Error creating account.");
        }
    }

    public static void handleLogin() throws SQLException {
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        UserId = manage.login(username, password);

        if(UserId != -1){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Invalid Credentials.");
        }
    }

    public static void handleDeposit() throws SQLException {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if(manage.deposit(UserId, amount)){
            System.out.println("Amount deposited!");
        }
    }

    public static void handleWithdraw() throws SQLException {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if(manage.withdraw(UserId,amount)){
            System.out.println("Amount Withdraw!");
        }else{
            System.out.println("Insufficient Balance.");
        }
    }

}
