package Oops.Other.StaticKey;


public class StaticBlock {
    static int a = 4;
    static int b;

    // static Block will only run 'once' when the 'first object' is created i.e. class is loaded first time into memory
    // You can't use this key word inside static block  
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        // think about it
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);
        
        StaticBlock obj3 = new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);
    }
}
