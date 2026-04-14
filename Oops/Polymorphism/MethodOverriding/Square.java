package Oops.Polymorphism.MethodOverriding;

public class Square extends Shapes {

    int side = 20;

    void area() {
        System.out.println("Area : side * side");
    }

    static void shapeName() {
        System.out.println("In Square class..  ");
    }
    
}
