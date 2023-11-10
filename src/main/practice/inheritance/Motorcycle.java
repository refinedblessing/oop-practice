package main.practice.inheritance;

public class Motorcycle extends Vehicle {
    private boolean hasKickStart;

    public Motorcycle(String make, int year, String model, boolean hasKickStart) {
        super(make, year, model);
        this.hasKickStart = hasKickStart;
    }

    public boolean hasKickStart() {
        return hasKickStart;
    }

    public void kickStart() {
        if (hasKickStart) {
            System.out.println("The motorcycle is kick-started.");
        } else {
            System.out.println("This motorcycle does not have a kick-start feature.");
        }
    }

    @Override
    public void start() {
        System.out.println("The motorcycle has started");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle has come to a stop.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Kick Start: " + (hasKickStart ? "Yes" : "No");
    }
}

