package RecapWithChatGPT.Week1.Abstraction.Interface;

public class MySql implements Database{
    @Override
    public void connect(){
        System.out.println("MySql Connection");
    }
}
