package main.practice.inheritance2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("kpekpeye", "Nigeria");
        System.out.println(animal.getCountry());
        animal.makeSound();
        animal.sleep();


        Mammal mammal = new Mammal("sughu", "GHA", "grey");
        mammal.giveBirth();
        mammal.makeSound();
        System.out.println(mammal);


        Dog myDog = new Dog("Buddy", "USA", "Brown", "Golden Retriever");
        myDog.makeSound();
        myDog.sleep();
        System.out.println(myDog);
    }
}
