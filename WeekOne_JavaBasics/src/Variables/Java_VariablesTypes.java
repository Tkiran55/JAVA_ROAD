package Variables;

public class Java_VariablesTypes {

    public static  int a = 25; // Static variable/ class variable

    public int b  = 10; // Interface Variable / Non-static variable

    public static void main(String[] args) {

        int c = 30; // local variable

        System.out.println(a);

        Java_VariablesTypes x = new Java_VariablesTypes();
        System.out.println(x.b);

        System.out.println(c);
    }
}
