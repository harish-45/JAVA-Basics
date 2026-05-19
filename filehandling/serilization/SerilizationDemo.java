package filehandling.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerilizationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ayush Soni";
        s1.marks = 89;

        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere/serilize.txt";

        try {
            FileOutputStream writer = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(writer);

            oos.writeObject(s1);
            System.out.println("Object Saved in file... ");
            
            oos.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


