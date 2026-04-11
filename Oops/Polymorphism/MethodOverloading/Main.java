package Oops.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n ------ Method Overloadoing ------ \n");

        // which Method is being called it decided at 'Compile-time'
        Sum sum = new Sum();
        int ans1 = sum.add(10, 20);
        double ans2 = sum.add(10.5, 20);
        int ans3 = sum.add(10, 20, 30);

        System.out.println("Sum 2 args      : " + ans1);
        System.out.println("Sum double args : " + ans2);
        System.out.println("Sum 3 args      : " + ans3);

        System.out.println("\n End...");
    }
}
