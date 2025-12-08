import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(header(name));
    }
    public static boolean header(String username) {
        if (username.length() >= 5) {
            return true;
        }
        return false;
    }
}
