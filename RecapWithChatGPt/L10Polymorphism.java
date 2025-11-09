package RecapWithChatGPt;

public class L10Polymorphism {
    public static void main(String[] args) {

        Shape[] shapes =  new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for(Shape currentShape : shapes){
            currentShape.draw();
        }
    }
}


class Shape{
    void draw(){
        System.out.println("Drawing shapes.");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle.");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing rectangle.");
    }
}