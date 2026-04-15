package CollectionFramework.ArrayList;

import java.util.Arrays;

public class CustomGenricsArraylist<T> {

    private Object[] data;
    private static int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public CustomGenricsArraylist() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    public void add(T value) {
        if (this.isFull())
            resize();
        this.data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        this.data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, int value) {
        this.data[index] = value;
    }

    public int size() {
        return this.size;
    }

    public T remove() {

        // here make you 👆 fool , size decreased by one the data is overridden when
        // add() called
        return (T)(this.data[size--]);

    }

    @Override
    public String toString() {
        return "CustomArraylist [data=" + Arrays.toString(data) + " size="
                + size + "]";
    }

}
