package Generics.GenericClass;

public class Main {
    public static void main(String[] args) {

        /* ======>>>>>> BoxGen class <<<<<<====== */
        System.out.println("\n----- Another Example -----\n");

        // Now this box Except only Integer value (Type-Safe)
        BoxGen<Integer> box2 = new BoxGen<>();
        box2.setValue(100);
        int j = box2.getValue();

        // Now it show compile time error bcs Integer to String Casting
        // String s = (String) box2.getValue();

        System.out.println(j); // 100


        /* ======>>>>>> Pair class <<<<<<====== */
        System.out.println("\n----- Pair Example -----\n");

        Pair<String, Integer> pair = new Pair<>("Age", 18);
        System.out.println("Key   : " + pair.getKey());
        System.out.println("Value : " + pair.getValue());

        System.out.println("\nEnd...");
    }
}
