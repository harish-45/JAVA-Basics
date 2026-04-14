package Enum;

public class Basic {

    // Internally enum is a special class ,
    // -> final class Week extends Enum<Week> { }
    // Each enum constant are an object ( Week MONDAY = new Week(); )
    // Enum can implements interfaces 
    // Implecitly enum extends Enum<T>
    // Enum can contains Variables ,  Method  , Contructor 

    public enum Week {
        // these are enum constant
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        // By default public , static , final
        // since its final you can't create child enum


        // constructor 
        Week() {
            System.out.println("Constructor is called for : " + this);
        }
    };

    public static void main(String[] args) {
        System.out.println("\n--------  Enum  ---------\n");

        Week day;
        day = Week.THURSDAY;
        System.out.println(day); // THURSDAY

        // ordinal means the position of that day
        System.out.println(day.ordinal());

        //
        System.out.println();

        for (Week d : Week.values()) {
        System.out.println(" :-> " + d);
        }

    }
}
