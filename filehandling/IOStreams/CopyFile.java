package filehandling.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere\\images//";

        try(FileInputStream input = new FileInputStream(fileName+"unsplash.jpg");
                FileOutputStream output = new FileOutputStream(fileName + "copied.jpg")) {

            int i;
            while ((i=input.read())!=-1) {
                output.write(i);
            }
        } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
