package RecapWithChatGPT.Week1.Exception_ErrorHandling;

public class ExeThree {
    public static void main(String[] args) {

        try{
            String obj = "abc";
            int a = Integer.parseInt(obj);
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
