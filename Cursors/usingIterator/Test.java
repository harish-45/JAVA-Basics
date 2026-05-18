package Cursors.usingIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        // available for all Collection.
        // it is used to traverse the collection in forward direction only
        // it is used to traverse the collection in read and remove mode, we can remove the element from the collection using iterator but we cannot add the element to the collection using iterator 
        // it is fail-fast cursor, if we try to modify the collection while traversing the collection using iterator then it will throw ConcurrentModificationException

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("List Before : " + list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String ele = iterator.next();
            System.out.println(ele);
            if (ele == "Banana")
                iterator.remove();
        }
        
        System.out.println("list After : " + list);
    }
}
