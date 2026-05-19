package filehandling.IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere//filename.txt";

        try (FileInputStream input = new FileInputStream(fileName)) {
            int i;

            while ((i=input.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
