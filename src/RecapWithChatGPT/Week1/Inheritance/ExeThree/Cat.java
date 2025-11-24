package RecapWithChatGPT.Week1.Inheritance.ExeThree;

public class Cat extends Animal{
    Cat(){
        super();
        System.out.println("Cat Created");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }
    
}
