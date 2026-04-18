package Exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(devide(num, 0));
    }

    public static int devide(int a, int b) {
        try {
            String str = null;
            str.charAt(0);
            int res =  a / b;
            return res;
        } catch (NullPointerException | ArithmeticException e) { // Here e is an object that is thrown at runtime by JVM
            System.out.println("NullPointerException !  OR ArithmeticException !  : {^.,^}  ");
            return -1;
        } catch (RuntimeException e) {
            System.out.println("Something Went Wrong at runtime! ");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
