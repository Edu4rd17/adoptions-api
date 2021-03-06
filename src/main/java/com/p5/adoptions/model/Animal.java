package com.p5.adoptions.model;

public class Animal extends AbstractAnimal implements AnimalInterface {
    private String name;
    private String photo;

    public Animal(String name, String photo) {
        this.name = name;
        this.photo = photo;
    }

    public Animal() {

    }

    @Override
    public String makeSound() {
        return "Nothing!";
    }

    /**
     * Only visible to the classes that extend the parent!
     *
     * @return
     */
    protected String secondSound() {
        return "Nothing!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String whatDoesItEats() {
        return "Unknown";
    }

    @Override
    public String howManyLegs() {
        return null;
    }
}
