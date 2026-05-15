package filehandling.fileClass;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere/filename.txt";
        File myFile = new File(pathName);

        if (myFile.exists()) {
            System.out.println("file name : " + myFile.getName());
            System.out.println("file Path : " + myFile.getAbsolutePath());
            System.out.println("Writable : " + myFile.canWrite());
            System.out.println("Readable : " + myFile.canRead());
            System.out.println("file size in bytes : " + myFile.length());
        } else {
            System.out.println("file does not exist!");
        }
    }
}
