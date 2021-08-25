package com.p5.adoptions.model;

/**
 * An interface defines behaviour
 * If there are fields, they are public static
 * <p>
 * pluses:
 * generic method implementation
 * defines a contrast (defines methods available to be used after initialization)
 * <p>
 * minuses:
 * only public static fields
 * public methods
 */
public interface AnimalInterface {
    public static String hello = "Hello from animal kingdom!";

    String makeSound();

    public String howManyLegs();

}
