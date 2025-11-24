package RecapWithChatGPT.Week1.Exception_ErrorHandling;

public class ExeFour {
    public static void main(String[] args) {
        try{
            int[] numbers = new int[3];
            numbers[4] = 10;

        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Error: " +  e.getMessage());
        }
    }
}
