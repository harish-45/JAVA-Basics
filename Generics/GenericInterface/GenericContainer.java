package Generics.GenericInterface;

// second way 
// Here We implements Generic Interface in Generic type class
public class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
        
    }

    @Override
    public T get() {
        return item;
    }
}
