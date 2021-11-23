package net.kaupenjoe;

public class Dog extends Animal {
    public static final int dogToHumanYearMultiplier = 7;

    public Dog(String picture, String name, int age) {
        super(picture, name, age);
    }

    public int getAgeInHumanYears() {
        return age * dogToHumanYearMultiplier;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just woofed!");
    }
}
