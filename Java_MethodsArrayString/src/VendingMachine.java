import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};

        Scanner scanner = new Scanner(System.in);

        for(int i =0;i< menu.length;i++){
            System.out.println((i+1) + ". "+ menu[i]);
        }
        System.out.println();
        System.out.print("Select your drink (1-5): ");
        int choice = scanner.nextInt();

        if(choice >=1 && choice< menu.length){
            System.out.println(menu[choice-1]);
        }else{
            System.out.println("Invalid");
        }
    }
}
