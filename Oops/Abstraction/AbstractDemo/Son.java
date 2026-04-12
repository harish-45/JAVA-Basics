package Oops.Abstraction.AbstractDemo;

public class Son extends Parent {

    public Son(int age) {
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
