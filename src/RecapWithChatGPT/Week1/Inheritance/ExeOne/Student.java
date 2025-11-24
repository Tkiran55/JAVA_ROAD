package RecapWithChatGPT.Week1.Inheritance.ExeOne;

public class Student extends Person{
    int rollNumber;

    void study(){
        System.out.println("RollNumber " + rollNumber + " is studying");

    }

    public static void main(String[] args) {
        Student std = new Student();
        std.name = "Hari";
        std.rollNumber = 22;
        std.walk();
        std.study();

    }
}
