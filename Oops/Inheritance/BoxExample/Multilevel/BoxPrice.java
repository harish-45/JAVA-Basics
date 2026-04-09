package Oops.Inheritance.BoxExample.Multilevel;

import Oops.Inheritance.BoxExample.SingleLevel.BoxWeight;

public class BoxPrice extends BoxWeight {
    public double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(int side, int weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }


    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }


    public BoxPrice(int h, int d, int w, int weight, double cost) {
        super(h, d, w, weight);
        this.cost = cost;
    }

}
