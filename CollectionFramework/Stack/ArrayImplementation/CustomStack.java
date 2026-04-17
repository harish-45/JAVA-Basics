package CollectionFramework.Stack.ArrayImplementation;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public boolean push(int val) {
        // check the stack is full or not

        if (isFull()) {
            System.out.println("Stack Overflow!");
            return false;
        }

        data[++top] = val;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return data[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public int peek() {
        return data[top];
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
            if (i != top)
                System.out.print(", ");
        }
        System.out.println(" ]");
    }
}
