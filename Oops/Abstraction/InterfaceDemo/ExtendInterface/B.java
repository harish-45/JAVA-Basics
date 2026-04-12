package Oops.Abstraction.InterfaceDemo.ExtendInterface;

//  interface -> interface ===>> extends
public interface B extends A{

    void greet();

    // Aditional feature from java-8 
    // Default methods were introduced in interfaces to allow adding new methods without breaking existing implementations
    // we can override default methods as well
    // ..But two interface has same method and both implements by any class it gives compile-time error (bcs the ambiguity and complexity, especially the Diamond Problem )
    default void sayHello() {
        System.out.println("Hello from Interface...");
    }
    
}
