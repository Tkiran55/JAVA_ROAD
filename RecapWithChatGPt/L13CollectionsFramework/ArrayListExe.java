package RecapWithChatGPt.L13CollectionsFramework;
//Write a Java program that:
//Creates an ArrayList<String> of your 5 favorite movies.
//Prints the list, removes one movie, and prints it again.

import java.util.ArrayList;

public class ArrayListExe {
    public static void main(String[] args) {

        ArrayList<String> moviesList = new ArrayList<>();

        //adding movies title
        moviesList.add("Spirited Away");
        moviesList.add("Princess Mononoke");
        moviesList.add("Ghost in the shell");
        moviesList.add("Grave of the fireflies");
        moviesList.add("Your Name");

        //printing movies list
        System.out.println(moviesList);
        //removing movie from list
        moviesList.remove(1);
        //printing movies list again
        System.out.println(moviesList);

    }
}
