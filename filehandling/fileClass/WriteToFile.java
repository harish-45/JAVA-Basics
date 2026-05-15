package filehandling.fileClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Write in a file with try-with-resources :- This makes sure the writer is
        // closed automatically, even if an error occurs:

        String pathName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere/filename.txt";

        /*
         * // what FileWritter does :-
         * It opens the file at pathName for writing
         * creates the file if it does not exist
         * writes character data to the file
         * by default, overwrites the existing file content
         */
        try (FileWriter myWriter = new FileWriter(pathName)) {
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
