package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* INTERFACES AND ABSTRACT */

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        Cat whiskers = new Cat("whiskers.png", "Whiskers", 12);

        whiskers.makeSound();
        bengie.makeSound();
        gracie.makeSound();

        Animal animal = new Dog("jenny.png", "Jenny", 15);
        animal.makeSound();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(gracie);
        animals.add(whiskers);

        animals.get(1).makeSound();

        // Animal a = new Animal("x.png", "X", 10);

        List<IPettable> pets = new ArrayList<>();
        pets.add(bengie);
        pets.add(whiskers);

        pets.get(1).pet();

    }
}
