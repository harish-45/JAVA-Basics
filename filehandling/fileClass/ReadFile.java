package filehandling.fileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");
        try (Scanner reader = new Scanner(myFile)) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
