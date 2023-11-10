package main.practice.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, "Camry", false);
        car.start();
        car.stop();
        car.brake();
        System.out.println(car);

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2021, "Sportster", true);
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle);

        Truck truck = new Truck("Ford", 2020, "F-150");
        truck.start();
        truck.stop();
        System.out.println(truck);

        SelfDrivingCar selfDrivingCar = new SelfDrivingCar("Tesla", 2023, "Model S");
        selfDrivingCar.start();
        System.out.println(selfDrivingCar);
        selfDrivingCar.enableAutopilot();
        selfDrivingCar.stop();
        System.out.println(selfDrivingCar);
    }
}
