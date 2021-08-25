package com.p5.adoptions;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.AnimalInterface;
import com.p5.adoptions.model.Cat;
import com.p5.adoptions.model.Dog;

/**
 * OOP Principles
 * 1. Abstraction - model real life scenarios/objects into java classes and objects.
 * 2. Encapsulation - hide info about classes, allow access through getters and setters.
 * 3. Inheritance - define a parent class to be extended later.
 * 4. Polymorphism - something that can have multiple forms.
 */
public class OOPExample {
    public static void main(String[] args) {

        //first example of polymorphism
        Animal animal = new Dog("Rex", "www.google.com");
        System.out.println(animal.makeSound());

        animal = new Cat("Scuby", "www.google.com");
        System.out.println(animal.makeSound());

        //Make sure we have a cat
        if (animal instanceof Cat) {
            // cast syntax
            Cat thisIsACat = (Cat) animal;
            System.out.println(thisIsACat.customMethodToCats());
        }

        //Static example
        Cat cat = new Cat("Leon", "asfasdf", 3);

        int purrIntensity = cat.purrIntensity;
        String staticField = Cat.staticField;
    }

}
