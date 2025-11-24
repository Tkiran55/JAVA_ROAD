package RecapWithChatGPT.Week1.Encapsulation;

public class Car {
    private final String brand;
    private double speed;

    Car(String brand){
        this.brand = brand;
        this.speed = 0;
    }

    public void setSpeed(double newSpeed){
        if(newSpeed>=0){
            this.speed = newSpeed;
            System.out.println("Speed " + this.speed + " km/h.");
        }else{
            System.out.println("No negative number.");
        }
    }

    public double getSpeed(){
        return speed;
    }

    public String getBrand(){
        return brand;
    }
    public static void main(String[] args) {
        Car myCar = new Car("Suzuki");
        System.out.println("--- Initial State ---");
        System.out.println(myCar);
        System.out.println(myCar.getBrand());

        // --- Test Acceleration ---
        System.out.println("\n--- Acceleration Test ---");
        myCar.accelerate(); // Speed: 10
        myCar.accelerate(); // Speed: 20
        myCar.accelerate(); // Speed: 30
        System.out.println("Current State: " + myCar);
        System.out.println(myCar.getSpeed());


        // --- Test Braking ---
        System.out.println("\n--- Braking Test ---");
        myCar.brake(); // Speed: 20
        myCar.brake(); // Speed: 10
        myCar.brake(); // Speed: 0 (Testing the stop limit)
        myCar.brake(); // Speed remains 0 (Testing the guard rail)
        System.out.println("Current State: " + myCar);

        // --- Test Setter with Validation ---
        System.out.println("\n--- Setter Validation Test ---");
        // Valid set
        myCar.setSpeed(120);
        System.out.println("Current State: " + myCar);

        // Invalid set (negative value)
        myCar.setSpeed(-50);
        System.out.println("Current State (should not have changed): " + myCar);
    }

    public void accelerate(){
        this.speed += 10;
        System.out.print("Speed increased by 10: " + this.speed);
        System.out.println();
    }

    public void brake(){
        this.speed -= 10;
        System.out.print("Speed decreased by 10" + this.speed);
        System.out.println();
    }
}
