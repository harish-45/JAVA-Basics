package Oops.terms.Composition;

public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine '" + this.type + "' is starting...");
    }
}
