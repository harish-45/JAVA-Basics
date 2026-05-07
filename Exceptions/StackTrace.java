package Exceptions;

public class StackTrace {
    // Here Exception propogate from level3() to main() Method
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n ==== Program Finished ==== ");
    }
    

    public static void level3() {
        int[] arr = new int[5];
        arr[5] = 10; // java.lang.ArrayIndexOutOfBoundsException
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
