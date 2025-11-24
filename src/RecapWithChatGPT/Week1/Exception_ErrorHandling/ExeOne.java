package RecapWithChatGPT.Week1.Exception_ErrorHandling;

//Write code that creates a divide-by-zero error and catches it.


import java.util.Scanner;

public class ExeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();

        System.out.println("Enter a num");
        int b = sc.nextInt();

        try{
            int res = a/b;
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero.");
        }finally {
            System.out.println("Exited");
        }



    }
}
