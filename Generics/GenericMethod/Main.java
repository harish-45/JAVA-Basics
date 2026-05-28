package Generics.GenericMethod;

public class Main {

    // Syntax for Generic-Method
    public <T> void methodName(T param) {
        // Method body
    }
    
    // Example
    public <T> void printArray(T[] array) {

        for (T item : array) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    
    public <T> T getFirstElement(T[] array) {
        if (array.length > 0) {
            return array[0];
        }
        return null; 
    }

    public static void main(String[] args) {
       

    }
}
