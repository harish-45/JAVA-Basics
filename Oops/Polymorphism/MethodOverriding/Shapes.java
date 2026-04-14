package Oops.Polymorphism.MethodOverriding;

// use final to stop Inheritance 
// If we declare a class as final, Implicitily it declare all of its method final too 
public class Shapes {
    int side = 10;

    void area() {
        System.out.println("Area of shape.... ");
    }

    static void shapeName() {
        System.out.println("In Shapes class.. ");
    }

    // Early Binding 
    // you can't override final Method 
    final void greeting() {
        System.out.println("Hey i am in Shapes..");
    }
}
