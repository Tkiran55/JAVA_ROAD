package RecapWithChatGPT.Week1.Abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        Playable p = new Cricket();
        p.play();

        Playable p1 = new Football();
        p1.play();

        Database d = new MySql();
        d.connect();

        Database d1 = new PostgreSql();
        d1.connect();

    }
}
