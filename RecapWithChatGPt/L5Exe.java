package RecapWithChatGPt;

import java.util.ArrayList;

public class L5Exe {
    public static void main(String[] args) {

        // int[] numbers = {1,2,3,4,5};

        //changing elements => numbers[0] = 1;
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i=0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        // What if you do not know the size in advance
        // USe ArrayList

        ArrayList<String> movies = new ArrayList<>();

        movies.add("One punch man Season 1");
        movies.add("One punch man Season 2");
        movies.add("One punch man Season 3");

        //enhanced for loop
        for (String movie : movies) {
            System.out.println(movie);
        }

        movies.add("One punch man Season 4");

        System.out.println("Updated movies list are: ");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }
}
