package Oops.Polymorphism.MethodOverriding;

public class Main {

    // Variable and Static methods are not overridden, they are hidden (method hiding)
    public static void main(String[] args) {

        System.out.println("\n ------ Method Overriding ------ \n");

        Circle circle = new Circle();
        circle.area();

        System.out.println("\n ------ Run-time Polymorphism ------ \n");

        // Run time PolyMorphism =>
        // Condition : the type of reference is Parent class and object is type Subclass
        // which Methods , Variables are able to 'Access' is define by the type of Refernce (Parent)
        // But which Methods 'Called' is depend on the type of object (child)
        // It determines at 'Runtime' (Dynamic Method Dispatch)

        Shapes obj = new Circle();
        // Hence it decide at run time to call the area() Method of Circle
        obj.area();


        System.out.println("\n ------ No Polymorphism ------ \n");

        // No polymophism for Instance Variables 
        // bcs Instance Variable Uses Reference 
        // Instance Variables are resolved at compile-time (not runtime)
        Shapes square = new Square();
        // it print the Shapes side 
        System.out.println(square.side);


        System.out.println("\n ------ No Polymorphism ------ \n");

        // No polymorphism for static Method 
        // staic Method belongs to class , not object
        Shapes obj2 = new Square();
        obj2.shapeName(); // it act like Shapes.shapeName() ;

        System.out.println("\nEnd....");

    }
}
