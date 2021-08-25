package com.p5.adoptions.model;

public class Cat extends Animal implements AnimalInterface {

    public static String staticField = "This is a static field!";

    public Integer purrIntensity;

    public Cat(String name, String photo) {
        super(name, photo);
        System.out.println("Constructing a cat!");
        this.purrIntensity = 5;
    }

    public Cat(String name, String photo, Integer purrIntensity) {
        super(name, photo);
        this.purrIntensity = purrIntensity;
    }

    @Override
    public String makeSound() {
        return "Miau";
    }

    @Override
    public String whatDoesItEats() {
        return "Milk";
    }

    @Override
    public String howManyLegs() {
        return "Four";
    }

    // second example of polymorphism
    public String customMethodToCats() {
        return "Only cats can do this!";
    }

    public String customMethodToCats(String message) {
        return message;
    }
}
