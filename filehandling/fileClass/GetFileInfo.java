package filehandling.fileClass;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");

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
