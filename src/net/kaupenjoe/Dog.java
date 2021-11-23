package net.kaupenjoe;

public class Dog {
    // Adding some fields
    public String picture;
    protected String name;
    private int age;
    public static final int dogToHumanYearMultiplier = 7;

    // public, protected, private
    // static, final


    public int getAge() {
        return age;
    }

    // Default Constructor
    public Dog() {

    }

    public void birthday() {
        age++;
    }

    public int getAgeInHumanYears() {
        return age * dogToHumanYearMultiplier;
    }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    // Method
    public void woof() {
        System.out.println(this.name + " just woofed!");
    }
}
