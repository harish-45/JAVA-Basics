package Oops.Polymorphism.MethodOverloading;

public class Sum {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, int b) {
        return  a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
        
    }
}
