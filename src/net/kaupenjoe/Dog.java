package net.kaupenjoe;

public class Dog {
    // Adding some fields
    public String picture;
    public String name;
    public int age;

    // Default Constructor
    public Dog() {

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
