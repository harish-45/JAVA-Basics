package Oops.Other.WrapperClass;

// Why we use Wrapper-Classes :-
// JAVA - Collections only works with 'object' ;
// premitive types cann't be 'NULL' wrapper obj can be ;
// Wrapper class provides useful 'Utility Methods' like Integer.max(10,20) ;  


public class WrapperExample {
    
    public static void main(String[] args) {
        int a = 20;
        int b = 45;

        // premitive type pass by value (not pass by reference) so it will not swap
        swap(a, b);
        System.out.println(a + " " + b);

        //  Integer WrapperClass
        Integer num1 = 40;
        Integer num2 = 30;

        // still it will not swap because 'All Wrapper classes are Final'  
        swap(num1, num2);
        System.out.println(num1 + " " + num2);

        Integer n1 = 100;
        Integer n2 = 100;

        System.out.println(n1==n2); // true bcs they are refering to same object of Integer 

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
