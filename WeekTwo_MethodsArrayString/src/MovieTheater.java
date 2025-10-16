import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a row:");
        int row = sc.nextInt();
        System.out.print("Enter a col: ");
        int col = sc.nextInt();

        if(seats[row][col] == 0){
            System.out.println("Free");
        }else{
            System.out.println("Sold");
        }
    }
}
