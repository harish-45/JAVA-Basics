package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // File class
        File myFile = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\love/demo.txt");
        System.out.println("File name : " + myFile.getName());
        System.out.println("File path : " + myFile.getAbsolutePath());

        // create new file
        try {
            // createNewFile() return boolean value true for file created
            if (myFile.createNewFile()) {
                System.out.println("File created... ");
            } else {
                System.out.println("file already exists...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // write in a file

        try {
            // FileWriter class
            FileWriter fileWriter = new FileWriter(myFile.getAbsoluteFile());
            fileWriter.write("This is Demo file.\nNext line..");
            fileWriter.write("\nHey! Ayush.");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // read a file using Scanner class

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // delete file
        if (myFile.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
