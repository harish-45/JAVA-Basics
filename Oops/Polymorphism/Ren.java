package Oops.Polymorphism;

import Oops.Other.AccessControl.A;

public class Ren extends A{

    public Ren(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        System.out.println("\n ---- Protected Modifiers ----- \n");
        Ren obj = new Ren(10, "string");
        int n = obj.num;
        System.out.println(n);
    }
}
