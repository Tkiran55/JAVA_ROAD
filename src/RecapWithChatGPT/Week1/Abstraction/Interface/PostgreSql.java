package RecapWithChatGPT.Week1.Abstraction.Interface;

public class PostgreSql implements Database{
    @Override
    public void connect(){
        System.out.println("PostgreSql Connection");
    }
}
