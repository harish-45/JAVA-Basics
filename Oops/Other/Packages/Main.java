package Oops.Other.Packages;

import Oops.Other.Packages.a.A;
// import Oops.Other.Packages.a.Greeting;
import Oops.Other.Packages.b.Greeting;



public class Main {
    public static void main(String[] args) {


        // We use packages :  The package is both a naming and a visibility control mechanism.
        // Check import statement and ctrl + click to check from which package sayHello Method is imported 
        Greeting.sayHello();

       System.out.println();

        A obj = new A();
        // Here we are trying to print obj . And println call 'Default' .toString()
        // Method
        // That is :
        // public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }
        // that why it print 'Oops.Other.Package.A@2f92e0f4' something
        // We can easily override it .
        System.out.println(obj);
    }
}
