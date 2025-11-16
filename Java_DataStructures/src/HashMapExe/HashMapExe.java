package HashMapExe;

import java.util.HashMap;

public class HashMapExe {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "WashingtonDC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("Norway");

        //for loop
        //print keys
        for (String i : capitalCities.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Print values
        for (String i : capitalCities.values()) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
