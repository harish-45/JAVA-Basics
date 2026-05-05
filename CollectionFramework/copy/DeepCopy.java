package CollectionFramework.copy;

import java.util.Arrays;

// Deep_Copy using custom logic 
class Ex {
    private int[] data;

    public Ex(int[] values) {
        this.data = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}

public class DeepCopy {
  public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4 };
      Ex obj = new Ex(arr);

      obj.showData();

      arr[0] = 10;
      System.out.println(Arrays.toString(arr));

      obj.showData();
  }  
}
