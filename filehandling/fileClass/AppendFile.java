package filehandling.fileClass;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere/filename.txt";

        // true in argument : Append Mode ;
        try (FileWriter fileWriter = new FileWriter(pathName, true)) {

            fileWriter.write("\nThis line is appended in file");
            System.out.println("Successfully Appended to file");
        } catch (IOException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}
