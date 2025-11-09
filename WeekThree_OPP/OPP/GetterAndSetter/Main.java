package GetterAndSetter;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red" , 10000);
        Car car2 = new Car("Suzuki", "Blue" , 20000);

        car1.setColor("Black");
        car1.setPrice(5000);
        car1.displayInfo();
        car2.displayInfo();
    }
}
