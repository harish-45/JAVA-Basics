package CollectionFramework.LinkedList.SinglyLinkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        IntLL list1 = new IntLL();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        // list1.removeLast();
        // list1.removeLast();

        list1.add(70);
        list1.display();
        System.out.println(list1.size());
        System.out.println(list1.deleteLast());
        System.out.println(list1.deleteLast());
        System.out.println(list1.deleteLast());
        // System.out.println(list1.deleteLast());
        // System.out.println(list1.deleteLast());
        // System.out.println(list1.deleteLast());
        System.out.println(list1.find(20));
        // System.out.println(list1.deleteLast());
        list1.display();
        System.out.println(list1.size());
        // list1.add(4, 20);

        // System.out.println(list1.size());
        // System.out.println(list1.get(4));

        // GenericLinkedList<Integer> list2 = new GenericLinkedList<>();
        // list2.add(10);
        // list2.add(30);
        // list2.add(40);
        // list2.addFirst(60);

        // // list2.removeLast();
        // // list2.removeLast();

        // list2.add(50);
        // list2.add(70);
        // list2.add(6, 20);

        // list2.display();
        // System.out.println(list2.get(4));


        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);



        // System.out.println(list);

    }
}