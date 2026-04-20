package CollectionFramework.LinkedList.SinglyLinkedlist;

public class IntLL {
    private Node head;
    private Node tail;
    private int size;

    public IntLL() {
        this.size = 0;
    }

    private static class Node {
        private Integer value;
        private Node next;

        public Node(Integer value) {
            this.value = value;
        }

        public Node(Integer value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Add Node at tail position
    public void add(Integer value) {

        Node newNode = new Node(value);

        // check list is empty
        if (this.head == null)
            head = newNode;
        else
            this.tail.next = newNode;

        this.tail = newNode;
        this.size++;
    }

    public void add(Integer index, Integer value) {
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            add(value);
        } else if (this.size < index) {
           
            System.out.println("Index Out of Bound ");
        
        } else if (index > 0 && index < size ) {
            Node current = head;
            int i = 1;
            // traverse to index-1 position then add new Node at index position
            while (i != index - 1) {
                current = current.next;
                i++;
            }
            Node newNode = new Node(value, current.next);
            current.next = newNode;
        } 
    }

    // Add Node at head position
    public void addFirst(Integer value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        // check list is empty
        if (this.tail == null)
            this.tail = head;
        this.size++;
    }

    // Display all Nodes
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null \n");
    }

    // Get a particualar Node
    public Node get(int index) {
        // check the index Node Exist 0R NOT
        if (index <= 1) {
            return head;
        }
         
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Remove Node from tail position
    public int deleteLast() {
      
        // check list has only one Node 0R Empty list
        if (size <= 1) {
            return deleteFirst();
        }
       
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // deleteFirst 
    public int deleteFirst() {
        // if (head == null) {
        //     return -1;
        // }
        int val = head.value;
        this.head = head.next;
        if (head == null) {
            this.tail = null;
        }
        size--;
        return val;
    }

    public int find(Integer val) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.value.equals(val))
                return i;
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int remove(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        this.size--;
        return val;
    }
    
    // Size of list
    public int size() {
        return this.size;
    }

}
