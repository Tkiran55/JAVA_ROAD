package RecapWithChatGPt;

public class L9Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        Bicycle bicycle = new Bicycle();
        bicycle.move();


    }

}

class Vehicle{
    void move(){
        System.out.println("THe vehicles moves.");
    }
}

class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("The Car drives.");
    }
}

class Bicycle extends Vehicle{
    @Override
    void move(){
        System.out.println("The Bicycle pedals.");
    }
}