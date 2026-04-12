package Oops.Abstraction.AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    public void carrer(String cName) {
        System.out.println("I am gona be : " + cName);
    }

    @Override
    public void partner(String name, int age) {
        System.out.println("I love : " + name + ", he is " + age + " old");
    }
}
