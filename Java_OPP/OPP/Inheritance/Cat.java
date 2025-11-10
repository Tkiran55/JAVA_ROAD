package Inheritance;

public class Cat extends Animal {

    String name;

    Cat(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(this.name + " eats fish.");
    }
}
