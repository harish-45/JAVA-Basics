package Oops.Inheritance.BoxExample.SingleLevel;

public class BoxWeight extends Box {
    public int weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {

        // BoxWeight → Box   (Upcasting) 
        // A BoxWeight object can be treated as a Box object  (Inheritance Bacic funda)
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(int h, int d, int w, int weight) {
        super(h, d, w); // call the parent class constructor 

        // // it also work if fields are in same file or not private'
        // this.h = h;
        // this.d = d;
        // this.w = w;

        this.weight = weight;
    }
}
