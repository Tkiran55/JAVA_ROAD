package GetterAndSetter;

public class Car {
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }

    void setPrice(int price){
        this.price = price;
    }
    int getPrice(){
        return this.price;
    }


    void displayInfo(){
        System.out.println(this.color + " " + this.model + ": $" + this.price);
    }
}
