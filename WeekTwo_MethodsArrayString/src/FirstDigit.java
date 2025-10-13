import java.util.Scanner;

public class FirstDigit {
    // function with no return type
    public static void findFirstDigit(int num){
        num = Math.abs(num);
        while(num>=10){
            num /= 10;
        }
        System.out.println("The first digit is: " + num);
    }

    // function with return type
    public static int findFirstDigit2(int num){
        num = Math.abs(num);
        while(num>=10){
            num /= 10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        findFirstDigit(number);
        System.out.println(findFirstDigit2(number));
    }
}
