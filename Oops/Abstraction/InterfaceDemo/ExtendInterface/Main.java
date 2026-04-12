package Oops.Abstraction.InterfaceDemo.ExtendInterface;

//  class -> inteface ===>> implements
public class Main implements B{

    @Override
    public void greet() {
        System.out.println("Greet...");
        
    }

    @Override
    public void show() {
        System.out.println("Show...");
    }
    
    public static void main(String[] args) {
        B obj = new Main();
        
        obj.show();
        obj.greet();

        // say Hello is not override by Main class 
        // ..it is a default method in interface
        obj.sayHello();
    }
    
}
