package Oops.Other.SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true means : they are refers to same object
        
        // ternary operator in java
        String str = (obj1 == obj2) ? "they are same object" : "they are different object!";
        System.out.println(str);
    }
}
