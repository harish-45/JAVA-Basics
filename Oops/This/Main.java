package Oops.This;

public class Main {
    public static void main(String[] args) {

        Student priya = new Student();
        System.out.println(priya);
        System.out.println("Rollno : " + priya.rollno);
        System.out.println("Name   : " + priya.name);
        System.out.println("Marks  : " + priya.marks);

        System.out.println();

        Student kunal = new Student(13, "Harry", 5.0f);
        System.out.println("Rollno : " + kunal.rollno);
        System.out.println("Name   : " + kunal.name);
        System.out.println("Marks  : " + kunal.marks);

        System.out.println();

        Student copy = new Student(kunal);
        System.out.println("Rollno : " + copy.rollno);
        System.out.println("Name   : " + copy.name);
        System.out.println("Marks  : " + copy.marks);

        System.out.println();

        Student obj = new Student(10);
        System.out.println();
        System.out.println("Rollno : " + obj.rollno);
        System.out.println("Name   : " + obj.name);
        System.out.println("Marks  : " + obj.marks);
    }
}
