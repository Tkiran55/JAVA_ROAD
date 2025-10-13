package ConditionalAndLooping.problems;


public class Patterns {
    public static void main(String[] args) {
        //Print a square
        int number = 5;
//        filled square
        for(int i=0; i<number; i++){
            for (int j=0; j<number; j++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }

        System.out.println();

        //unfilled square
        for(int i=0; i<number; i++){
            for (int j=0; j<number; j++){
                if((i == 0) || (i == number -1) || (j == 0) || (j == number - 1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
             }
            }
            System.out.println();
        }

        //right angle triangle
        for(int i=0; i<=number; i++){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //right angle triangle
        for(int i=number; i>=1; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
