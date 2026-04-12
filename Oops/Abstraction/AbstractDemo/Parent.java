package Oops.Abstraction.AbstractDemo;

//  A class containns one or many abstract Method must also be declared as abstract class 
//  # we cann't make the object of abstract class 
//  # An abstract class contains concrete (Method with body ) + abstract Method
//  # we can't declare abstract class as final . bcs final stop inheritance then how we override abstract method
public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // # you can't create the abstract constructor
    // abstract Parent();

    // # you can't create abstract static method
    // abstract static void sayHello();

    // # you can create Concrete static method bcs they belongs to class name not to object
    public static void sayHello() {
        System.out.println("Hello form Parent... ");
    }

    public abstract void carrer(String cName);

    public abstract void partner(String name, int age);

    public void greeting() {
        System.out.println("Greeting from Parent... ");
    }

}
