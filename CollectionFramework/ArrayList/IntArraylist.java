package CollectionFramework.ArrayList;

import java.util.Arrays;

public class IntArraylist {

    private int[] data;
    private static int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public IntArraylist() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    public void add(int value) {
        if (this.isFull())
            resize();
        this.data[size++] = value;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        this.data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        this.data[index] = value;
    }

    public int size() {
        return this.size;
    }

    public int remove() {

        // here make you 👆 fool , size decreased by one the data is overridden when add() called
        return this.data[size--];

    }

    @Override
    public String toString() {
        return "CustomArraylist [data=" + Arrays.toString(data) + " size="
                + size + "]";
    }

   
}
