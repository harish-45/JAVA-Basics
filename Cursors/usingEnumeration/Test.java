package Cursors.usingEnumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        // Enumeration is a cursor used to traverse the collection, one by one
        // it is used to traverse the collection in forward direction only
        // it is used to traverse the collection in read-only mode
        // only for legacy classes (available from java 1.0) like Vector, Stack, Hashtable 

        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        // toString() method is called to print the vector and it will print the elements of the vector in the form of a list
        System.out.println(vector); 

        Enumeration<String> e = vector.elements();
        while (e.hasMoreElements()) {
            String item = (String) e.nextElement();
            System.out.println(item + " -> " + item.length() );
        }
    }
}
