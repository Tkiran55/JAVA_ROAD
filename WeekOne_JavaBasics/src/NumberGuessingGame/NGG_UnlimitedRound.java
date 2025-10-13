package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NGG_UnlimitedRound {
    public static int max = 100;
    public static int min = 1;


    public static void main(String[] args) {
        System.out.println("***** Number Guessing Game *****");
        System.out.println("(Between 1 to 100)");

        guessingGame();
    }


    public static void guessingGame() {


        Random random = new Random();
        int randomNumber = random.nextInt(max) + min;
        System.out.println("Number to guess: " + randomNumber);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = false;
        int attempts = 0;


        while (!isRunning) {
            attempts++;

            System.out.print("Enter a guess: ");
            int guessNumber = scanner.nextInt();


            if (guessNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                isRunning = true;
            } else if (guessNumber > randomNumber) {
                System.out.println("The number is lesser than " + guessNumber);
            } else {
                System.out.println("The number is greater than " + guessNumber);
            }

        }

        System.out.println("Game over.");
    }
}


