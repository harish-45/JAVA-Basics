// you must run from the parent directory.
package Oops.Other.This;

// This keyword referce to that object ('obj' reference variable) who is call Constructor or Methods 
public class Student {
    public int rollno;
    public String name;
    public float marks;

    public Student() {
        this.rollno = 0;
        this.name = null;
        this.marks = 0.0f;
    }
    
    // Student kunal = new Student(13,"Harry",5.0f);
    // here this will replce with kunal
    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    
    public Student(Student other) {
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // how you call a constructor from another constructor 
    public Student(int marks) {
        this(10, "Default person", 100);
    }
}
