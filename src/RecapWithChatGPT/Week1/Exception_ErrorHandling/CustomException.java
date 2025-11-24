package RecapWithChatGPT.Week1.Exception_ErrorHandling;

public class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }


    static void withdraw(int amount) throws CustomException{
        int balance = 1000;
        if(amount > balance){
            throw  new CustomException("Insufficient Balance");
        }

    }

    public static void main(String[] args) {


        try {
            withdraw(2000);
        } catch (CustomException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }
    }
}
