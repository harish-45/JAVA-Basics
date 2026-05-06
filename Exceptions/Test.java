package Exceptions;

public class Test {
    public static void main(String[] args) {
        int[] numerators = { 10, 200, 30, 40 };
        int[] denominators = { 2, 10, 0, 4 };

        for (int i = 0; i < numerators.length; i++) {
            System.out.println(devide(numerators[i], denominators[i]));
        }
        System.out.println("Good Job!");
    }

    public static int devide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) { // Here e is an object that is thrown at runtime by JVM
            System.out.println(e);// As you know sout call the toString() Method and Every class has its own toString()    { java.lang.ArithmeticException: / by zero }
    
            // String s = getClass().getName();
            // String message = getLocalizedMessage();
            // return (message != null) ? (s + ": " + message) : s;
            return -1;
        }
    }
}
