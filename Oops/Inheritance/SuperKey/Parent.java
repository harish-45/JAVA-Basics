package Oops.Inheritance.SuperKey;

public class Parent {
    int money;
    int age;

    public Parent(int money) {
        // It call the Object() bcs by Default every class extends Object class 
        super();
        this.money = money;

        System.out.println("Parent class constructor");
   }
}
