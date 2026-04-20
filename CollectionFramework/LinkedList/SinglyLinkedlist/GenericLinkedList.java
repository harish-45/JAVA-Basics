package CollectionFramework.LinkedList.SinglyLinkedlist;

public class GenericLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GenericLinkedList() {
        this.size = 0;
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    // Add Node at tail position (more clean code)
    public void add(T value) {

        // check it is first Node
        if (this.head == null) {
            addFirst(value);
            return;
        }

        Node<T> newNode = new Node<>(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.size++;
    }

    public void add(int index, T value) {

        if (index == 0) {
            // Add at head position
            addFirst(value);
        } else if (index == size) {
            // Add at tail position
            add(value);
        } else if (index > 0 && index < size) {
            Node<T> currNode = head;
            int i = 1;
            while (i != index - 1) {
                currNode = currNode.next;
                i++;
            }
            Node<T> newNode = new Node<>(value, currNode.next);
            currNode.next = newNode;
        }
    }

    // Add Node at head position
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        // check list is empty
        if (head != null) {
            newNode.next = head;
            head = newNode;
        } else {
            this.head = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    // Display all Nodes
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    // Remove Node from tail position
    public void removeLast() {
        Node<T> current = head;
        // check list has only one Node 0R Empty list
        if (current == null || current.next == null) {
            head = null;
            return;
        }

        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        this.tail = current;
        this.size--;

    }

    // Get a particualar Node
    public T get(int index) {
        Node<T> temp = head;
        int i = 0;
        // check the index Node Exist 0R NOT
        if (index < 0 || index >= size) {
            System.err.println("index out of Bound ");
            return null;
        }
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        return temp.value;
    }

    // removeStart 
    public void removeStart() {
        if (head.next != null || head != null)
            this.head = head.next;
        else 
            this.head = null;
        this.size--;
    }
}
