package Oops.Other.FinalKey;

public class Main {
    public static void main(String[] args) {
        // final float PI = 3.14345f;
        // // you cann't modify final variable
        // // PI = 3.312454f
        // System.out.println(PI);

        final Student gold = new Student("gold", 20);

        // since the object is final but still you are able to change the state (var.)
        // of the object
        gold.name = "Kkana";
        System.out.println(gold.name);

        // but you can not change the reference of the object
        Student harry = new Student("harry", 20);
        // gold = harry;

        // Means =>: If an instance variable of a reference type has the final modifier,
        // the value of that instance variable (the reference to an object) will never
        // change—it will always refer to the same object—but the value of the object
        // itself can change

        // destroy a obj
        Student A;
        for (int i = 1; i <= 1000000; i++) {
            A = new Student("Unknown", i);
        }
    }
}
