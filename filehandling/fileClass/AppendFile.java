package filehandling.fileClass;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        // true in argument : Append Mode ;
        try (FileWriter fileWriter = new FileWriter("filename.txt",true)) {
            fileWriter.write("\nThis line is appended in file");
            System.out.println("Successfully Appended to file");
        } catch (IOException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}
