package Oops.Other.StaticKey;

public class ExecutionOrder {

    // static block runs before the main() Method  
    static {
        System.out.println("Static Block...");
    }

    public static void main(String[] args) {
        System.out.println("Main Method... ");
    }

}
