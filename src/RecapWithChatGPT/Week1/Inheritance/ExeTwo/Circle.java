package RecapWithChatGPT.Week1.Inheritance.ExeTwo;

public class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Area of circle.");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}
