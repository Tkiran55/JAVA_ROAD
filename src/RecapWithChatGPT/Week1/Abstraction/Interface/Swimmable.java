package RecapWithChatGPT.Week1.Abstraction.Interface;

interface Swimmable {
    default void swim(){
        System.out.println("Swimming");
    }
}
