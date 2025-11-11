import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String filePath = "D:\\Kiran\\JAVA\\Java_FileHandling\\Info.txt";
        String fileContent = "Hello, I am learning java.";
        // use """ .......
        //        .......... """ for multiple lines

        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(fileContent);
            System.out.println("Successfully wrote the file");
        } catch (FileNotFoundException e){
            System.out.println("Could not locate the file.");
        } catch (IOException e) {
            System.out.println("Error. Could not write the file.");
        }
    }
}
