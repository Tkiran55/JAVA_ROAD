package StringBuilderAndStringBuffer;

public class ReverseString {
    public static void main(String[] args) {

        String text = "Hello Java";
        String reversed;

        StringBuilder sb = new StringBuilder(text);
        reversed = String.valueOf(sb.reverse());

        System.out.println(reversed);

    }
}
