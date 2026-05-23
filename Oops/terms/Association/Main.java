package Oops.terms.Association;

public class Main {
    public static void main(String[] args) {
        
        // Creating a laptop
        Laptop laptop1 = new Laptop("Dell");

        // Creating a student with a laptop
        Student student1 = new Student("Alice", laptop1);

        // Creating a student without a laptop
        Student student2 = new Student("Bob");

        // Displaying information about the students
        student1.show();
        student2.show();
    }
}
