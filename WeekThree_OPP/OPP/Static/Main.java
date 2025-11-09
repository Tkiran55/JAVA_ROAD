package Static;

public class Main {

    public static void main(String[] args) {

        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Tom");
        Friend friend3 = new Friend("Jerry");

        Friend.showFriend();

    }
    //static = makes variable or method  belong to the class
    // rather than to any specific object.
    //commonly used  for utility  methods or shared resources





}
