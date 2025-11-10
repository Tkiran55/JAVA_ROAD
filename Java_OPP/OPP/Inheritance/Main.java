package Inheritance;

public class Main {
    public static void main(String[] args) {

        // Inheritance = one class inherits the attributes and methods from another class.
        // Child <- Parent <- Grandparent
        // Here organism is grandparent,
        // plant and animal is child of grandparent and parent to
        // dog and cat is child of parent.

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.absorbs();

        Animal animal = new Animal();
        System.out.println(animal.isAlive);
        animal.sound();

        Dog dog = new Dog("Luna");
        System.out.println(dog.isAlive);
        System.out.println(dog.name);
        dog.eat();

        Cat cat = new Cat("Ssri");
        System.out.println(cat.isAlive);
        System.out.println(cat.name);
        cat.eat();
    }
}
