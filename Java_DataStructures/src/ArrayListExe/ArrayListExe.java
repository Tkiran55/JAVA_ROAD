package ArrayListExe;

import java.util.ArrayList;
import java.util.Scanner;

// Ask the user to store foods in the list as they want
// Print all the food names.
public class ArrayListExe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>();

        System.out.print("Enter a number of food you want to store in a bucket?: ");
        int numberOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i< numberOfFood; i++){
            System.out.print("Enter food name " + (i+1) + ": ");
            String foodName = scanner.nextLine();
            myList.add(foodName);
        }
        System.out.println("List of food items: " + myList);
        scanner.close();

    }
}
