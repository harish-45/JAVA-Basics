package filehandling.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere\\images";

        try (FileInputStream input = new FileInputStream(fileName + "//unsplash.jpg");
                FileOutputStream output = new FileOutputStream(fileName + "//copy.jpg")) {

            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }

            System.out.println("Image copied Successfully!");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}