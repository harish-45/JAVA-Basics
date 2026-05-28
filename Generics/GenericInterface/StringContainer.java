package Generics.GenericInterface;

//  First way 
// Here We implements Generic Interface in non-Generic type class
public class StringContainer implements Container<String> {

    private String item;

    @Override
    public void add(String item) {
        this.item = item;
        
    }

    @Override
    public String get() {
        return item;
    }
    
    
}
