package Oops.terms.Association;

public class Student {
    String name;
    Laptop laptop;

    // Constructor for Student without a laptop
    public Student(String name) {
        this.name = name;
    }

    // Constructor for Student with a laptop
    public Student(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    public void show() {
        System.out.println(this.name + " has a " + (this.laptop != null ? this.laptop.brand : "no") + " laptop.");
    }
}
