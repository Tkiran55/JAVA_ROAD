import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "D:\\Kiran\\JAVA\\Java_FileHandling\\Info.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.println("File exists");

            String line;
            while((line = reader.readLine() ) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file.");
        } catch (IOException e){
            System.out.println("Could not read from file.");
        }
    }
}
