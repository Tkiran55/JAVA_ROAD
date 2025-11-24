package TikTacToeGame;

import java.util.Scanner;

public class Main {
    static GameManagement management = new GameManagement();
    static Scanner scanner = new Scanner(System.in);
//    String winner = null;


    public static void main(String[] args) {
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        management.printBoard();

        System.out.print(management.turn + "'s will play first.\nEnter a slot number to place X in: ");
        int numInput = scanner.nextInt();

        if(!(numInput >0 && numInput<=9)){
            System.out.print("Invalid input; re-enter slot number again: ");
        }

        management.checkSlot(numInput);
        management.printBoard();

    }

}
