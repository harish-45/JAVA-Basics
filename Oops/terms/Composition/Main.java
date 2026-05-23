package Oops.terms.Composition;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2020, "V6");

        car1.startCar();

        System.out.println("Car 1 Information:");
        car1.carInfo();

    }
}
