package Oops.Other.AccessControl;

public class A {

    // public means it can be accesible from anyclass 
    public String name;

    // No modifires means it can be access in the same Packages
    int[] arr;

    // Protected means it can be access in diff. package using inheritance and through subclass reference 
    protected int num;


    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}