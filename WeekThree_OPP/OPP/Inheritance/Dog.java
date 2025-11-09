package Inheritance;

public class Dog extends Animal{

    String name;

    Dog(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(this.name + " eats meat.");
    }
}
