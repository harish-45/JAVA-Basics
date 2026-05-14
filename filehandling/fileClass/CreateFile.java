package filehandling.fileClass;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("file Created " + myObj.getName());
            } else {
                System.out.println("file already exist");
                System.out.println(myObj.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
