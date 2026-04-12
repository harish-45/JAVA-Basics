package Oops.Abstraction.InterfaceDemo.InnerInterface;

 class A {
    public  interface InnerA {
        boolean isOdd(int num);
    }
}

public class B implements A.InnerA{

    @Override
    public boolean isOdd(int num) {
        return num%2!=0;
    }
        
}
