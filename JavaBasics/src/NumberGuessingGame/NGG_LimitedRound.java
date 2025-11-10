package NumberGuessingGame;

import java.util.Scanner;

public class NGG_LimitedRound {
    public static void main(String[] args) {
        System.out.println("***** NUMBER GUESSING GAME *****");
        System.out.println("(Between 1 to 100)");

        // Random Number Generate between 1 and 100;
        int max = 100;
        int min = 1;
        int attempts = 5;

        int randomNumber = (int)(Math.random() * (max - min + 1)) + min;
//        System.out.println("Number to guess: "  + randomNumber);

        System.out.println("You have " + attempts + " attempts to guess the correct answer.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<attempts; i++){
            System.out.println("Attempt " + (i+1));
            System.out.print("Enter a guess: ");
            int guessNumber = scanner.nextInt();

            if(guessNumber == randomNumber){
                System.out.println("Congratulations! You guessed the correct number.");
                return;
            }else if(guessNumber > randomNumber){
                System.out.println("The number is lesser than " + guessNumber);
            }else{
                System.out.println("The number is greater than " + guessNumber);
            }
        }
        System.out.println("Sorry, You have exhausted all attempts. The number was: " + randomNumber);



    }
}