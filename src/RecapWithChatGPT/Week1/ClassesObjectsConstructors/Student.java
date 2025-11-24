package RecapWithChatGPT.Week1.ClassesObjectsConstructors;

public class Student {
    //Create a class Student with: name, age, grade
    String name;
    int age;
    double grade;
    //a method display() to print the values
    void display(){
        System.out.println("My name is " + name) ;
        System.out.println("My age is " + age);
        System.out.println("My grade is " + grade);
    }
    //Create 2 objects and display their data.
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "JAVA";
        std.age = 25;
        std.grade = 55;

        std.display();

    }
}
