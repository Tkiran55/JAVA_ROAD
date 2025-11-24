package RecapWithChatGPT.Week1.Abstraction.Interface;

interface Flyable {

    default void fly(){
        System.out.println("Flying");
    }
}
