package RecapWithChatGPt.L13CollectionsFramework;
//Creates a HashMap<String, Double> of movie ratings (e.g., "Inception" → 9.0).
//Prints all movie names with their ratings using a loop.


import java.util.HashMap;

public class HashMapExe {
    public static void main(String[] args) {
        HashMap<String, Double> moviesRating = new HashMap<>();

        moviesRating.put("The shawshank redemption", 9.3);
        moviesRating.put("The godfather",9.2);
        moviesRating.put("The dark knight",9.1);
        moviesRating.put("The godfather part 2",9.0);
        moviesRating.put("12 angry men",9.0);

//        System.out.println(moviesRating.get("12 angry men"));

        System.out.println("____Movies with ratings____");
        for(String key: moviesRating.keySet()
        ){
            System.out.println(key + ": " + moviesRating.get(key));
        }

    }
}
