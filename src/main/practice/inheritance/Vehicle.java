package main.practice.inheritance;

public class Vehicle {
    private String make;
    private int year;
    private String model;

    public Vehicle(String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle Information:\n" +
                "Make: " + make + "\n" +
                "Year: " + year + "\n" +
                "Model: " + model;
    }
}
