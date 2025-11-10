package ConditionalAndLooping.problems;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to start countdown: ");
        int startNumber = sc.nextInt();

        while(startNumber > 0){
            System.out.println(startNumber);
            Thread.sleep(1000);
            startNumber--;
        }

        System.out.println("Happy Birthday!");


    }
}
