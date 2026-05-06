package Exceptions;

public class finallyBlock {
    public static void main(String[] args) {
        
        System.out.println(divide(10, 0));

    }

    public static int divide(int a, int b) {
        try {
            System.out.println("Inside try Block");
            return a / b;
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
            return -1;
        } finally {
            // always run
            // Execution Order : try -> catch -> finally ; return statement execute after finally block
            System.out.println("Inside finally Block");
        }
    }
}
