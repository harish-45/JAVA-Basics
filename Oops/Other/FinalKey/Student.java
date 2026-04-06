package Oops.Other.FinalKey;

public class Student {
    
    // final varible must be initalized while declearation 
    final int OFFER = 20;

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // finalize() method is execute when no reference variable is pointing to that perticullar object 
    // finalize() defined what to do when garbage collector destroy the object 
    protected void finalize() throws Throwable {
        System.out.println("The object is distroyed");
    }
}
