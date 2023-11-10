package main.practice.inheritance2;

class Dog extends Mammal {
    private final String breed;

    public Dog(String name, String country, String skinColor, String breed) {
        super(name, country, skinColor);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
