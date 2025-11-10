package ConditionalAndLooping.problems;

import java.util.Scanner;

public class Factorial {

    public static void factorialNumber(int num){
        int fact =1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int number = sc.nextInt();

        factorialNumber(number);


    }
}
