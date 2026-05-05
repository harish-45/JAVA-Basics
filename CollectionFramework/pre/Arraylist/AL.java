package CollectionFramework.pre.Arraylist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class AL {

    // Collection <-- List ( Interfaces ) <-- ArrayList ( Concrete Class )

    // Iterator is an object used to traverse elements of a collection one by one 
    public static void main(String[] args) {

        // using Collection interface 
        Collection<Integer> collection = new ArrayList<>();

        // using List Interface
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(202);
        list2.addAll(list);
        System.out.println(list2);

        System.out.println(list2.size());

        // list2.removeAll(list);

        System.out.println(list2);

        Iterator<Integer> it = list2.iterator();
        // .hasNext() return true or false
        // .next() return next element
        // .remove() delete element


        while (it.hasNext()) {
            System.out.println("Ele : " + it.next());
        }

        System.out.println(list2);

        System.out.println(list2.get(3));

        list2.set(3, 500);
        System.out.println(list2.contains(500));
    
        System.out.println(list2);

        // .toArray() convert list into array & return
        Object[] arr = list2.toArray();
        System.out.print("Array Ele are : ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
 

    }
}
