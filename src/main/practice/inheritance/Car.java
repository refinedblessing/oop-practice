package main.practice.inheritance;

public class Car extends Vehicle {
    private boolean isConvertible;

    public Car(String make, int year, String model, boolean isConvertible) {
        super(make, year, model);
        this.isConvertible = isConvertible;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    @Override
    public void start() {
        System.out.println("The car is starting");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("Applying the brakes. Slowing down.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Convertible: " + (isConvertible ? "Yes" : "No");
    }
}
