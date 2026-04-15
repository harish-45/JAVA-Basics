package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.get(2);
        list.set(1, 40);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("\n------- Custom Arraylist ------\n");

        // customArraylist to show how it internally work
        IntArraylist list2 = new IntArraylist();
        // list2.add(10);
        // list2.add(20);
        // list2.add(30);

        for (int i = 0; i < 11; i++) {
            list2.add(2 * i);
        }
        list2.remove();
        list2.size();
        list2.set(5, 100);
        System.out.println(list2);


        System.out.println("\n------- Custom Arraylist Generics ------\n");

        CustomGenricsArraylist<Integer> list3 = new CustomGenricsArraylist<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
          list3.remove();
        list3.size();
        list3.set(5, 100);
        System.out.println(list3);
    }
    
}
