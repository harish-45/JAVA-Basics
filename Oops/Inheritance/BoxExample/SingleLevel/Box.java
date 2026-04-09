package Oops.Inheritance.BoxExample.SingleLevel;

public class Box {
    public int h;
    public int d;
    public int w;

    // Default Constructor
    public Box() {
        this.h = this.d = this.w = -1;
    }

    // Cube Constructor
    public Box(int side) {
        this.h = this.d = this.w = side;
    }

    public Box(int h, int d, int w) {
        this.h = h;
        this.w = w;
        this.d = d;
    }

    // Pass obj in contructor
    public Box(Box old) {
        this.h = old.h;
        this.d = old.d;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Height :  " + h);
        System.out.println("Depth  :  " + d);
        System.out.println("Width  :  " + w);
    }

}
