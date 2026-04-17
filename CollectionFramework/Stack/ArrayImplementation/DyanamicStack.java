package CollectionFramework.Stack.ArrayImplementation;

public class DyanamicStack extends CustomStack{
   public DyanamicStack() {
       super();
    }

    public DyanamicStack(int size) {
        super(size);
    }
    
    @Override
    public boolean push(int val) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
        
        return super.push(val);
    }
}
