package Abstract;

public abstract class Shape {

    abstract double area(); //abstract methods

    void display(){ //concrete methods
        System.out.println("This is a shape.");
    }
}
