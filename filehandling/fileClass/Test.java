package filehandling.fileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

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

    // public static void main(String[] args) {
    // File myFile = new File("demo.txt");

    // try {
    // if (myFile.createNewFile()) {
    // System.out.println("File created : " + myFile.getName());
    // } else {
    // System.out.println("File is Already exist! ");
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // try {
    // FileWriter writer = new FileWriter("demo.txt");
    // writer.write("First line in the file. \nNext Line...");
    // System.out.println("Writed Succesfully!");
    // writer.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // try (FileWriter writer = new FileWriter("demo.txt", true)) {
    // writer.write("\nthis is appended Line in file! ");
    // System.out.println("Append a new Line Succesfully!");
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // try (Scanner reader = new Scanner(myFile)) {
    // System.out.println("File Data -->> ");
    // while (reader.hasNextLine()) {
    // System.out.println(reader.nextLine());
    // }
    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // }

    // if (myFile.delete()) {
    // System.out.println("file deleted : " + myFile.getName());
    // } else {
    // System.out.println("failed to delete file");
    // }
    // }
}
