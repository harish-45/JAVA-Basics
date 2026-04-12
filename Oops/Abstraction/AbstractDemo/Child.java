package Oops.Abstraction.AbstractDemo;

// When superclass contains abstract method Either they must be override (Implement) Abstract method of superclass or declare as abstract in child class 
public class Child extends Parent {

    public Child(int age) {
        super(age);
    }

    @Override
    public void carrer(String cName) {
        System.out.println("I am gona be : " + cName);
    }

    @Override
    public void partner(String name, int age) {
        System.out.println("I love : " + name + ", she is " + age + " old");
    }
}
