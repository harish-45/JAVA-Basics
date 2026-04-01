import java.util.Arrays;

public class StringComparision {
    public static void main(String[] args) {
        String a = "harry";
        String b = "harry";
        System.out.println(a == b); // true bcs compare reference are the same in string pool

        String c = new String("Dhaked");
        String d = new String("Dhaked");
        System.out.println(c == d); // false bcs they are refer to two different object in heap

        String e = new String("Dhaked");
        String f = new String("Dhaked");
        System.out.println(e.equals(f)); // True bcs .equals() method compare values and value are same 

        String g = "kunal khushwaha";
        String h = "kunal khushwaha";
        String i = g;
        System.out.println(i == h); // it is also true because We assign the same reference to i 
        

        System.out.println(Arrays.toString(args));
    }
}
