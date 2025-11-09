package Static;

public class Friend {

    String name;
    static int numOfFriends;

    Friend(String name){
        this.name =name;
        numOfFriends++;
    }

    static void showFriend(){
        System.out.println("You have " + numOfFriends + " total friends.");
    }
}
