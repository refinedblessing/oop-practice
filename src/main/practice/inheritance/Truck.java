package main.practice.inheritance;

public class Truck extends Vehicle {

    public Truck(String make, int year, String model) {
        super(make, year, model);
    }

    @Override
    public void start() {
        System.out.println("The truck has started, watch out");
    }

    @Override
    public void stop() {
        System.out.println("The truck is coming to a stop.");
    }
}

