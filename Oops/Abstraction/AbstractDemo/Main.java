package Oops.Abstraction.AbstractDemo;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n ---- Basic Abstraction ---- ");

        // # You Cann't create the object of abstract class
        // Parent obj = new Parent(10);

        // # You can use Parent as reference  (runtime polymorphism) 
        Parent obj = new Child(10);
        obj.carrer("Child...");

        System.out.println();


        Daughter shusi = new Daughter(22);
        shusi.carrer("Doctor...");
        shusi.partner("Rahul", 24);

        System.out.println();


        Son aditya = new Son(25);
        aditya.carrer("Designer...");
        aditya.partner("kanak", 26);
        

        System.out.println("\nEnd...");
    }

}