package Superkey;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kiran", "Lama");
        Student student = new Student("Hari","Gale", 3.01);
        Employee employee = new Employee("Bale", "Goat" ,15000);

        person.showName();

        student.showGPA();

        employee.showSalary();
    }
}
