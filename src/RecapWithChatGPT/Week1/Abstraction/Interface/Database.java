package RecapWithChatGPT.Week1.Abstraction.Interface;

interface Database {

    default void connect(){
        System.out.println("Database Connection");
    }
}
