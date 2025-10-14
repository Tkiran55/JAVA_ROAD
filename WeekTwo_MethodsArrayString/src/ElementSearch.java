import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 7, 3, 8};
        int target = 3;
        boolean isFound = false;

        for(int i=0; i< numbers.length; i++){
            if(target == numbers[i] ){
                System.out.println("Element found in index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Not found");
        }


        String[] foods = {"apple" , "banana", "tomato" , "potato" , "mango"} ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a food name you like to find if it is available or not: ");
        String foodName = scanner.nextLine();

        for (String food : foods) {
            if (foodName.equalsIgnoreCase(food)) {
                System.out.println("Food Found");
            }else{
                System.out.println("Food not Found");
            }
            break;

        }



    }
}
