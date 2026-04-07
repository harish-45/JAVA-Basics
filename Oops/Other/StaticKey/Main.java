package Oops.Other.StaticKey;

public class Main {
    public static void main(String[] args) {

        
        System.out.println("\n ---- Human Details ---- \n");

        // Human
        Human ayush = new Human("ayush", 20, 10_000, false);
        Human aman = new Human("Aman", 21, 10_000, false);
        Human rahul = new Human("Rahul", 22, 10_000, true);
        Human suresh = new Human("Suresh", 20, 10_000, false);

        System.out.println();

        Human.showName(ayush);
        Human.showName(aman);
        Human.showName(rahul);
        Human.showName(suresh);

        System.out.println();

        System.out.println(Human.population);

       


    }
}
