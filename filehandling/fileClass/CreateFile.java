package filehandling.fileClass;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere/filename.txt";

        try {
            /*
             * // What File classObj does :->
             * // It creates a java.io.File object that represents:
             * a filesystem path (pathName)
             * metadata like the name and location
             * a handle you can use to check or manipulate the file
             */

            File myObj = new File(pathName);
            if (myObj.createNewFile()) { // Create the actual file
                System.out.println("file Created! file name :" + myObj.getName());
            } else {
                System.out.println("file already exist");
                System.out.println("file Name : " + myObj.getName());
                System.out.println("file path : " + myObj.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
