package RecapWithChatGPT.Week1.Exception_ErrorHandling;

import java.util.Scanner;

public class ManualThrow {

    public static int number(int a){
        if(a<0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        number(num);


    }
}
