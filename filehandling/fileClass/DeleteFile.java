package filehandling.fileClass;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere/filename.txt";
        File myFile = new File(pathName);
        
        if (myFile.delete()) {
            System.out.println("Deleted the file : " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
