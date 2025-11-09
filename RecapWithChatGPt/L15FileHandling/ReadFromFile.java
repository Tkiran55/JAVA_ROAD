package RecapWithChatGPt.L15FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Kiran\\IdeaProjects\\4_Week_Java\\info.txt";
        try{
            BufferedReader reader = new BufferedReader( new FileReader(fileName));
            System.out.println("File exists");

            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Could not locate file.");
        }catch (IOException e){
            System.out.println("Something went Wrong.");
        }

    }
}
