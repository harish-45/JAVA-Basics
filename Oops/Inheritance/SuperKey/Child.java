package Oops.Inheritance.SuperKey;

public class Child extends Parent{
    String name;
    int age;


    public Child(int money, String name ,int age) {
        super(money); // It calls the Constructor of Parent class 

        this.age = age;
        
        // super refers to the immidiate superClass 
        super.age = 20 + this.age  ;
        System.out.println("Child class constructor");


    }

}
