package Oops.Other.InnerClasses;

public class Main {
    public static void main(String[] args) {

        // Correct way to create the object of inner-class 
        OutsideClass.B b3 = new OutsideClass.B("Harry");
        OutsideClass.B b4 = new OutsideClass.B("Rahul");

        System.out.println(b3.name);
        System.out.println(b4.name);
    }
}
