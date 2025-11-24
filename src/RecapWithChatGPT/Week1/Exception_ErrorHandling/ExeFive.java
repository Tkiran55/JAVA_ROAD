package RecapWithChatGPT.Week1.Exception_ErrorHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExeFive {

    static void readFile() throws FileNotFoundException {
        FileReader reader = new FileReader("abc.txt");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

