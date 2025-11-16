package HashSetExe;

import java.util.HashSet;

public class HashSetExe {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.contains("Mazda"));
        cars.remove("Volvo");
        System.out.println(cars);
        System.out.println(cars.size());

        for(String i: cars){
            System.out.print(i + ",");
        }
        cars.clear();
    }
}
