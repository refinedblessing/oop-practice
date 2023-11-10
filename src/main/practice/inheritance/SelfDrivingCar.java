package main.practice.inheritance;

public class SelfDrivingCar extends Vehicle {
    private boolean isAutopilotEnabled;

    public SelfDrivingCar(String make, int year, String model) {
        super(make, year, model);
        this.isAutopilotEnabled = false;
    }

    public boolean isAutopilotEnabled() {
        return isAutopilotEnabled;
    }

    public void enableAutopilot() {
        if (!isAutopilotEnabled) {
            System.out.println("Autopilot enabled. The vehicle can now drive itself.");
            isAutopilotEnabled = true;
        } else {
            System.out.println("Autopilot is already enabled.");
        }
    }

    public void disableAutopilot() {
        if (isAutopilotEnabled) {
            System.out.println("Autopilot disabled. You are in control now.");
            isAutopilotEnabled = false;
        } else {
            System.out.println("Autopilot is already disabled.");
        }
    }

    @Override
    public void start() {
        System.out.println("The self-driving car is starting");
    }

    @Override
    public void stop() {
        System.out.println("The self-driving car is stopping");
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Autopilot Enabled: " + (isAutopilotEnabled ? "Yes" : "No");
    }
}
