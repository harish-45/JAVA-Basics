package filehandling.fileClass;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Write in a file with try-with-resources :- This makes sure the writer is
        // closed automatically, even if an error occurs:

        try (FileWriter myWriter = new FileWriter("filename.txt")) {
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
