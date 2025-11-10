package DiceRollingGame;

import java.util.Random;
import java.util.Scanner;

public class DRG {

    public static void printDice(int roll) {
        String dice1 = """
             -------
            |       |
            |   ●   |
            |       |
             -------
            """;
        String dice2 = """
             -------
            | ●     |
            |       |
            |     ● |
             -------
            """;
        String dice3 = """
             -------
            | ●     |
            |   ●   |
            |     ● |
             -------
            """;
        String dice4 = """
             -------
            | ●   ● |
            |       |
            | ●   ● |
             -------
            """;
        String dice5 = """
             -------
            | ●   ● |
            |   ●   |
            | ●   ● |
             -------
            """;
        String dice6 = """
             -------
            | ● ● ● |
            | ● ● ● |
            | ● ● ● |
             -------
            """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }


    public static void main(String[] args) {

        int noOfDice;
        int total = 0;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no of dice to roll: ");
        noOfDice = sc.nextInt();

        if(noOfDice > 0){
            for(int i =0 ; i<noOfDice; i++){
                int roll = random.nextInt(1,7);
                printDice(roll);
                System.out.println("You rolled: " + roll);

                total += roll;
            }
            System.out.println("Total: " + total);
        }else {
            System.out.println("No cannot be below zero");
        }
    }

}
