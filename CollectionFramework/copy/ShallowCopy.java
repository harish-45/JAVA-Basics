package CollectionFramework.copy;

import java.util.ArrayList;
import java.util.Arrays;

class Ex {
    
    private int[] data;

    // Shallow_Copy
    public Ex(int[] values) {
        this.data = values;
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
    
}

public class ShallowCopy {
    public static void main(String[] args) {

        // Here arr & data both are refering to the same Array _object
        int[] arr = { 1, 2, 3 };
        Ex obj = new Ex(arr);

        obj.showData();
 
        arr[0] = 10;
        obj.showData();

        System.out.println("\n ===== list Example ===== \n");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // .clone() method also do Shallow_Copy
        Object obj1 = list.clone();

        System.out.println("cloned List : " + obj1);
        
        list.set(2, 400);

        System.out.println(" List after : " + list);

        System.out.println("cloned List : " + obj1);
       
    }
}
