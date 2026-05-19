package filehandling.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA-Basics\\filehandling\\fileAreHere//serilize.txt";

        try (FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)) {            ;

            Student s1 = (Student) ois.readObject();
            System.out.println("Student name  : " + s1.name);
            System.out.println("Student marks : " + s1.marks);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
