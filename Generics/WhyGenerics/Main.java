package Generics.WhyGenerics;

import java.util.ArrayList;

import Generics.GenericClass.BoxGen;
import Generics.GenericClass.Pair;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n------ Issue without Generics ------\n");
        // Issue :
        // No type safety
        // Manual casting
        // no compile time checking

        // it is not type-safe basically it stores values in Object type
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(54);
        list.add(45.34);

        // why get() method return a object type value:
        // bcs our list is storing any type value and Every class extends Object class
        // (Integer extends Object)
        Object o = list.get(0);
        Integer n = (Integer) list.get(1);
        System.out.println(o); // Hello
        System.out.println(n); // 54

        System.out.println(list); // [Hello, 54, 45.34]

        
        /* ======>>>>> Box class <<<<<======= */

        System.out.println("\n----- Another Example -----\n");

        Box box = new Box();
        box.setValue(10);
        int i = (Integer) box.getValue();

        // String s = (String) box.getValue(); // ClassCastException (Run time Error )
        System.out.println(i); // 10


        System.out.println("\n----- Benefits of Generics -----\n");

        // using Generics we make Arraylist type safe
        // now it only store only Integer value
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(44);
        list2.add(12);

        // list2.add("Hello"); // not possible give error

        Integer a = list2.get(1);
        System.out.println(a); // 44

        System.out.println(list2); // [23, 44, 12]


    }
}