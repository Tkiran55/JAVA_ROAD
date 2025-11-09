package RecapWithChatGPt;

import java.util.Scanner;

public class L4Exe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("You can vote.");
        }else{
            System.out.println("You cannot vote yet.");
        }

        for(int i = 1; i<=10; i++ ){
            System.out.println(i);
        }
    }
}
