package Oops.Inheritance.BoxExample;

import Oops.Inheritance.BoxExample.Multilevel.BoxPrice;
import Oops.Inheritance.BoxExample.SingleLevel.Box;
import Oops.Inheritance.BoxExample.SingleLevel.BoxWeight;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n ---- ==== SINGLELEVEL INHERITANCE ==== ---- \n");



        System.out.println("\n ----- ====== ------ \n");

        // SuperParent class object creation
        Box box1 = new Box(10, 12, 33);
        Box box2 = new Box(box1);
        box2.information();


        System.out.println("\n ----- ====== ------ \n");

        // child class default object 
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h + " " + box3.weight);

        
        System.out.println("\n ----- ====== ------ \n");

        BoxWeight box4 = new BoxWeight(7, 8, 9, 200);
        box4.information();
        System.out.println("Weight :  " + box4.weight);


        System.out.println("\n ----- ====== ------ \n");

        // Type of ref-var is Box but actual object is type Boxweight
        Box box5 = new BoxWeight(10, 12, 15, 100);
        // DownCasting : Parent -> Child  ( Box -> BoxWeight)
        BoxWeight box6 = (BoxWeight) box5;
        box5.information();
        System.out.println("Weight :  " + box6.weight);


        // System.out.println("\n ----- ====== ------ \n");

        //  Here ref-var is type child and you are assigning the object of type Parent 
        //  Failed at compileTime bcs  => the actual object is Box . You are forcing it to behave like BoxWeight
        // BoxWeight box7 =  new Box(1, 2, 3);
        // box7.information();

        // // And if you try to typecast in BoxWeight:
        // // But it fails at run time  : "ClassCastException"
        // BoxWeight box7 = (BoxWeight) new Box(1, 2, 3);
        // box7.information();
        // // Key rule : You can only cast an object to a subclass if it was originally created as that subclass


        System.out.println("\n ----- ====== ------ \n");

        BoxWeight box8 = new BoxWeight(box4);
        box8.information();
        System.out.println("Weight :  " + box8.weight);


        System.out.println("\n ----- ==== MULTILEVEL INHERITANCE ==== ------ \n");

        // default object 
        BoxPrice box9 = new BoxPrice();
        box9.information();
        System.out.println("Weight  : " + box9.weight);
        System.out.println("Price   : " + box9.cost);
        


        System.out.println("\n ----- ====== ------ \n");


        BoxPrice box10 = new BoxPrice(10, 250, 1000);
        box10.information();
        System.out.println("Weight  : " + box10.weight);
        System.out.println("Price   : " + box10.cost);
    }
}
