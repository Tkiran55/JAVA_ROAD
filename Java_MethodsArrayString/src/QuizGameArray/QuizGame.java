package QuizGameArray;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {


        String[] questions = {
                "What is the capital city of Nepal?",
                "What is the capital city of Nepal?",
                "What is the capital city of Nepal?",
                "What is the capital city of Nepal?",
                "What is the capital city of Nepal?",
        };

        String[][] options = {
                {"1. Kathmandu", "2. Bkt", "3. Lalitpur" , "4. Dhe"},
                {"1. Bkt", "2. Kathmandu", "3. Lalitpur" , "4. Dhe"},
                {"1. Lalitpur", "2. Bkt", "3. Kathmandu" , "4. Dhe"},
                {"1. Kathmandu", "2. Bkt", "3. Lalitpur" , "4. Dhe"},
                {"1. Dhe", "2. Bkt", "3. Lalitpur" , "4. Kathmandu"},
        };

        int[] answers = {1,2,3,1,4 };
        int score = 0;


        System.out.println("*** Welcome to Quiz Game ***");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<questions.length ; i++) {
            System.out.println(questions[i]);
            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter a answer: ");
            int answer = scanner.nextInt();

            System.out.println("********");
            if(answer == answers[i]){
                System.out.println("Correct");
                System.out.println("********");
                score++;
            }else{
                System.out.println("Wrong");
                System.out.println("********");
            }
        }

        System.out.println("You final score is: " + score + " out of " + questions.length);

    }
}
