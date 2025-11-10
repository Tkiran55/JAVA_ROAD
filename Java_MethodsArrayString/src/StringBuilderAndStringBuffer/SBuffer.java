package StringBuilderAndStringBuffer;

public class SBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        //methods
        System.out.println(sb.append(" Java"));
        System.out.println(sb.insert(5, " Kiran"));
        System.out.println(sb.replace(6,11,"I am"));
        System.out.println(sb.delete(0,6));
        System.out.println(sb.length());
    }
}
