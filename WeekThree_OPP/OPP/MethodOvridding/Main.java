package MethodOvridding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog =  new Dog();
        Fish fish = new Fish();

        animal.move();
        dog.move();
        fish.move();
    }
}
