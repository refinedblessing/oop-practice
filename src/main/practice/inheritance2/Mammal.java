package main.practice.inheritance2;

class Mammal extends Animal {
    private final String skinColor;

    public Mammal(String name, String country, String skinColor) {
        super(name, country);
        this.skinColor = skinColor;
    }

    @Override
    public void makeSound() {
        System.out.println("boo boo");
    }

    public void giveBirth() {
        System.out.println("A mammal is giving birth.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Skin Color: " + skinColor;
    }
}
