package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class InBuiltArraylist {

    public static void main(String[] args) {

        // ArrayList of JAVA And its some important Methods
        ArrayList<Integer> list1 = new ArrayList<>();
        
        // add(val)
        for (int i = 1; i < 10; i++) {
            list1.add(i * 10);
        }
        // add(idx,val) at perticullar index 
        list1.add(4, 500);

        // get(idx) -> ele at index
        System.out.println(list1.get(3));

        // set(idx , val) -> Replace ele at perticullar index 
        list1.set(3, 33);

        // remove(idx) -> remove ele by index 
        list1.remove(4);

        // remove(Integer.valueOf(val)); -> delete by value
        list1.remove(Integer.valueOf(33));

        // size()
        System.out.println(list1.size());

        // contains -> Checks element existence
        System.out.println(list1.contains(20));

        // isEmpty()
        System.out.println(list1.isEmpty());

        // indexOf(val) -> return the first occurrence 
        System.out.println(list1.indexOf(50));

        // lastIndexOf(val) ->  return the last occurrence 
        System.out.println(list1.lastIndexOf(50));

        // ensureCapacity(capacity) -> preallocate memory means avoids resizing
        list1.ensureCapacity(50);

        System.out.println(list1);
        // clear() -> delete all ele
        list1.clear();

        



    }
}