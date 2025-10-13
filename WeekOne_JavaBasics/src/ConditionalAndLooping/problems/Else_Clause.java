package ConditionalAndLooping.problems;

import java.util.Scanner;

public class Else_Clause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 100){
            System.out.println("Big");
        }else{
            System.out.println("Number");
        }

    }
}
