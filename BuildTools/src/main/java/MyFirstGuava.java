import com.google.common.base.Strings;

public class MyFirstGuava {
    public static void main(String[] args) {

        String presentString = "Hello Guava";
        String emptyString = "";
        String nullString = null;

        System.out.println("1. Guava Strings Utility Check:");
        System.out.println("Is 'presentString' null or empty? " + Strings.isNullOrEmpty(presentString));
        System.out.println("Is 'emptyString' empty? " + Strings.isNullOrEmpty(emptyString));
        System.out.println("Is 'nullString' null? " + Strings.isNullOrEmpty(nullString));

        System.out.println("Hello Maven! I am using Guava Dependencies.");

    }
}
