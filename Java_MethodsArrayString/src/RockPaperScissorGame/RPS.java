package RockPaperScissorGame;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper" , "scissor"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** ROCK PAPER SCISSOR ****");
        System.out.println("----------------------------");

        Random random = new Random();


        System.out.println();
        boolean isRunning = true;

        while(isRunning) {
            System.out.print("Player: ");
            String playerPlay = scanner.nextLine().trim().toLowerCase();

            // Validate input
            if (!playerPlay.equals("rock") && !playerPlay.equals("paper") && !playerPlay.equals("scissor")) {
                System.out.println("Invalid input! Please choose rock, paper, or scissor.");
                continue;
            }

            String computerPlay = rps[random.nextInt(3)];
            System.out.println("Computer: " + computerPlay);

            if (playerPlay.equals(computerPlay)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerPlay.equals("rock") && computerPlay.equals("scissor")) ||
                            (playerPlay.equals("paper") && computerPlay.equals("rock")) ||
                            (playerPlay.equals("scissor") && computerPlay.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again?(y/n): ");
            String playAgain = scanner.nextLine();

            if(playAgain.equalsIgnoreCase("n")){
                System.out.println("Thanks you for playing");
                isRunning =false;
            }
        }
        scanner.close();



    }
}
