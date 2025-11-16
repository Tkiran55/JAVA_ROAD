package ArrayListExe;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExe1 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(3, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println(cars);
        System.out.println(cars.get(1));  // Get the second element
        cars.set(0, "Opel"); // change an element
        System.out.println(cars);
        cars.remove(2); //remove an element
        System.out.println(cars.size()); //finds how many elements an Arraylist have
        System.out.println(cars);

        //sort ArrayList
        Collections.sort(cars);

        //looping through array
        for(int i=0; i<cars.size() ; i++){
            System.out.print(cars.get(i) + ", ");
        }

//        System.out.println();
//        //or use for-each loop
//        for(String car: cars){
//            System.out.print(car + ", ");
//        }


    }
}
