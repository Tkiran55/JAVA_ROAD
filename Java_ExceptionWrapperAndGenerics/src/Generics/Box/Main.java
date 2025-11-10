package Generics.Box;

public class Main{
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Doll");
        // box.setItem(123); //compile time error
        System.out.println(box.getItem());

        Box<Double> box1 = new Box<>();
        box1.setItem(4.5);
        System.out.println(box1.getItem());
    }
    
}
