public class Encapsulation {
    private int age;
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("Invalid age: Age cannot be set below 0.");
        }
    }
    public int getAge(){
        return this.age;
    }


    public static void main(String[] args) {
        Encapsulation student1 = new Encapsulation();
        student1.setName("Kiran");
        student1.setAge(27);

        System.out.println("--- Student 1 Details ---");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());


    }
}
