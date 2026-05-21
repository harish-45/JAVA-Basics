package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class tryWithResource {
    public static void main(String[] args) {

        // create a BufferReader object using try without Resource
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("abc.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the reader: " + e.getMessage());
            }
        }


        // try with resource : AutoCloseable Interface
        // try with resource is used to automatically close the resource after use
        // It is introduced in Java 7

        // create a BufferReader object using try with resource
        try (BufferedReader reader2 = new BufferedReader(new FileReader("abc.txt"))) {
            String line;
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
