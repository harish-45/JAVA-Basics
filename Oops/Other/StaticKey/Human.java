package Oops.Other.StaticKey;

public class Human {
    String name;
    int age;
    int salary;
    boolean isMarried;

    static int population;

    
    public Human(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
        Human.message();
    }
    
    // A static Method can't can accesible only static data until you specify the object reference explicitly  
    public static void showName(Human obj) {
        System.out.println("Name : " + obj.name); // here i am referencing an non-static 
    }
    

    public static void message() {
        System.out.println("new Human object is created!");
    }
}