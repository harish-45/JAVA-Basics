package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

// All Run-time Exception are checked , Others Unchecked 
public class UnChecked {

    // caller function throws a Exception ( trows )
    // We have to handle manually throws using try-catch 

    public static void main(String[] args) {
        try{
            method2();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("abc.txt"); // File not found Exception
    }



    // throw keyword : 

    public static void method3() throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("abc.txt");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND!");

            // ForceFully we create a object of FileNotFoundException 
            throw new FileNotFoundException();
        }
    }
}
