package Oops.Other.InnerClasses;

// Outside classes can not be static 
public class OutsideClass {

    // InnerClass : 
    class A {
        String name;

        public A(String name) {
            this.name = name;
        }

    }
    
    // static Inner class
   public static class B {
        public String name;

        public B(String name) {
            this.name = name;
        }
    }
    
    // static inner class with static instance 
    static class C {
            static  String name;

        public C(String name) {
            C.name = name;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("\n ---- non static Inner class ---- \n");
        // for accesing Non static inner class : we have to create a Instance (reference object) of outside class 
        OutsideClass obj = new OutsideClass();
        // using outside obj we are able to create object of innerclass
        A a1 = obj.new A("kunal");
        A a2 = obj.new A("Rahul");

        // it works as a normal class 
        System.out.println(a1.name);
        System.out.println(a2.name);


        System.out.println("\n ---- static Inner class ---- \n");
        // For accesing static Inner class we don't need the Instance of outside class   
        B b1 = new B("Kunal");
        B b2 = new B("Rahul");

        System.out.println(b1.name);
        System.out.println(b2.name);


        System.out.println("\n ---- static Inner class with Static Instance ---- \n");
        // Now it behave like normal class that have static Variable
        // correct coventions to create a object of static Inner class is : 
        OutsideClass.C c1 = new OutsideClass.C("Kunal");
        // but that is also work if we are working in the outSide class
        C c2 = new C("Rahul");

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}
