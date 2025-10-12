package HeadTailGame;

import java.util.Random;
import java.util.Scanner;

public class HTG {
    public static void main(String[] args) {

        System.out.println("*** HEAD OR TAIL ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a guess: ");
        String guess = scanner.nextLine().toLowerCase();

        Random random = new Random();
        boolean isHead;
        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("Head");
            if(guess.equals("head")){
                System.out.println("You win");
            }else{
                System.out.println("You lose");
            }
        }else{
            System.out.println("Tail");
            if(guess.equals("tail")){
                System.out.println("You win");
            }else{
                System.out.println("You lose");
            }
        }

    }
}
