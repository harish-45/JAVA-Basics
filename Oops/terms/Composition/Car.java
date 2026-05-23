package Oops.terms.Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    public Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        this.engine.start();
        System.out.println("Starting the car...");
    }
    
    public void carInfo() {
        System.out.println("Model : " + this.model);
        System.out.println("Year : " + this.year);
        System.out.println("Engine Type : " + this.engine.type);
    }
}
