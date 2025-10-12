package ConditionalAndLooping.problems;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        // calculate and print result as a string
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();

        System.out.println("1 to ADD\n2 to Subtract\n3 to Multiply" );
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        if(choice == 1){
            int add = num1 + num2;
            String x = Integer.toString(add);
            System.out.println(x);
        } else if (choice == 2) {
            int add = num1 - num2;
            String x = Integer.toString(add);
            System.out.println(x);
        } else if (choice == 3) {
            int add = num1 * num2;
            String x = Integer.toString(add);
            System.out.println(x);
        }else {
            System.out.println("Invalid Input");
        }
    }
}
