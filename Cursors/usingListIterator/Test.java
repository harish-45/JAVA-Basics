package Cursors.usingListIterator;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        // limitations of Enumeration and Iterator:
        // 1. Enumeration and Iterator are read-only cursors, we cannot add the element to the collection using Enumeration and Iterator.
        // 2. Enumeration and Iterator are unidirectional cursors, we can traverse the collection in forward direction only using Enumeration and Iterator.
        
        
        // why we use ListIterator:
        // 1. ListIterator is a bidirectional cursor, we can traverse the collection in forward and backward direction using ListIterator.
        // 2. ListIterator is a read and write cursor, we can add the element to the collection using ListIterator.
        
       
        LinkedList<String> list = new LinkedList<>();
        list.add("c");
        list.add("cpp");
        list.add("java");
        list.add("python");
        list.add("javascript");

        System.out.println("List Before : " + list);

        // forword iteration
        System.out.println("\nList in forword direction : ");

        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + "-> ");
            if (!(iterator1.hasNext())) {
                // adding element to the collection using ListIterator
                iterator1.add("ruby");
                System.out.print("null\n");
            }
        }

        System.out.println("\nList After : " + list);
        
        //Backword iteration 
        System.out.println("\nList in Backword direction : ");

        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()) {
            System.out.print(iterator2.previous() + "-> ");
            if (!(iterator2.hasPrevious())) {
                // removing element from the collection using ListIterator
                iterator2.remove();
                System.out.print("null\n");
            }
        }
        
        System.out.println("\nList After : " + list);

        // Enumeration, Iterator, ListIterator are fail-fast cursors, if we try to modify the collection while traversing the collection using Enumeration and Iterator then it will throw ConcurrentModificationException.
        // Example of fail-fast behavior of ListIterator

        try {
            ListIterator<String> iterator3 = list.listIterator();
            while (iterator3.hasNext()) {
                String ele = iterator3.next();
                System.out.println(ele);
                if (ele.equals("python"))
                    list.remove(ele); // we cannot modify the collection while traversing the collection using Cursors, it will throw ConcurrentModificationException
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException occurred!");
            e.printStackTrace();
        }
    }
}
