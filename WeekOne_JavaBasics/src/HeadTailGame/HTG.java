package HeadTailGame;

import java.util.Random;
import java.util.Scanner;

public class HTG {
    public static void main(String[] args) {

        System.out.println("*** HEAD OR TAIL ***");

        Scanner scanner = new Scanner(System.in);
        boolean isRunning;

        do {
            System.out.print("Enter a guess: ");
            String guess = scanner.nextLine().toLowerCase();

            Random random = new Random();
            boolean isHead;
            isHead = random.nextBoolean();
//            System.out.println(isHead);

            if (isHead) {
                System.out.println("Coin flipped: Head");
                if (guess.equals("head")) {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose");
                }
            } else {
                System.out.println("Coin flipped: Tail");
                if (guess.equals("tail")) {
                    System.out.println("You win");
                } else {
                    System.out.println("You lose");
                }
            }
            System.out.println("Do you want to play again? (y/n): ");
            String playAgain = scanner.nextLine();
            if(playAgain.equalsIgnoreCase("y")){
                isRunning = true;
            }else{
                System.out.println("Bye Bye");
                isRunning =false;
            }

        }
        while(isRunning);



    }
}
