package ConditionalAndLooping.problems;

import java.util.Scanner;

public class MultiplicationTable {

    public static void multiplication(int num){

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i) );

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Multiplication Table of: ");
        int number = sc.nextInt();


        multiplication(number);



    }
}
