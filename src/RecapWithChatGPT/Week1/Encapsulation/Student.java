package RecapWithChatGPT.Week1.Encapsulation;

public class Student {
    private String name;
    private double marks;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMarks(double marks){
        if(marks >= 0 && marks <= 100 ){
            this.marks = marks;
        }else{
            System.out.println("Marks must be between 0 and 100.");
        }
    }

    public double getMarks(){
        return marks;
    }

    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Hero");
        std.setMarks(50);

        System.out.println("Name: " + std.getName());
        System.out.println("Marks: " + std.getMarks());

        // Example of an invalid set
//        std.setMarks(105);
//        System.out.println("Marks after invalid set: " + std.getMarks());

    }
}
