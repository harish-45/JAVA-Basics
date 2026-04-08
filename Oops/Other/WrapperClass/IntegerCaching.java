package Oops.Other.WrapperClass;

// Integer Caching means java store Integer value form -128 to 127 in Integer Cache (similar to String pool)
// Beyond the limit it store normally (every value create a new object) 

public class IntegerCaching {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b); // true 
        
        Integer c = 200;
        Integer d = 200;

        System.out.println(c==d); // false  

    }
}
