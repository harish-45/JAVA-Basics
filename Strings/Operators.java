import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // One thing to remember whenever you print a object using println it call .toString() intrernally && every type of object has different .tostring() Method so output vary

        System.out.println('a' + 'b');

        System.out.println('z' - 'a');

        // first addition than concatination 'Everything becomes String after first String'
        System.out.println(5 + 4 + " Hello");

        // Concating Strings
        System.out.println("a" + "b");

        System.out.println((char) ('a' + 3));

        // => Here int is converted into 'Integer' (wrapper class) that call .tostring() and become "a" + "1"
        System.out.println("a" + 1);

        ArrayList<Integer> list = new ArrayList<>();
        // => it print square brackets []
        System.out.println(list);

        System.out.println("kunal" + new ArrayList<>());

        // operator '+' in java only defines for premitives && when any one of these value is String || (means it not work : )
        // System.out.println(new Integer(10) + new ArrayList<>());

        System.out.println(new Integer(10) + "" + new ArrayList<>());

    }
}
