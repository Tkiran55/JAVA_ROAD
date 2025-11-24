package RecapWithChatGPT.Week1.Abstraction.Interface;

public class Duck implements Flyable, Swimmable{

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
