package Oops.Inheritance.SuperKey;

public class Main {
    public static void main(String[] args) {
        Child obj = new Child(1000, "Aman", 12);
        
        Parent obj1 = obj; // UpCasting 

        System.out.println("Parent age  : " + obj1.age);
        System.out.println("child age  : " + obj.age);

    }
}
