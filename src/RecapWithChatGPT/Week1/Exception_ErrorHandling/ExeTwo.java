package RecapWithChatGPT.Week1.Exception_ErrorHandling;

//Access invalid array index and catch the error.

public class ExeTwo {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};

        try{
            int find = numbers[10];
            System.out.println(find);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
