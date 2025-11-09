package RecapWithChatGPt.L15FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Kiran\\IdeaProjects\\4_Week_Java\\info.txt";
        String fileContent = """
                I am Kiran Tamang.
                I am learning java programming.
                """;

        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(fileContent);
            System.out.println("File has been written.");
        }catch (FileNotFoundException e){
            System.out.println("Could not locate the file location.");
        }catch (IOException e) {
            System.out.println("Could not write file");
            throw new RuntimeException(e);
        }
    }
}
