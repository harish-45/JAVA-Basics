package Generics.GenericClass;

// Syntax of Generic type class
class A<T> {
    // T :- Integer , String , Double.........
}


public class BoxGen<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}

