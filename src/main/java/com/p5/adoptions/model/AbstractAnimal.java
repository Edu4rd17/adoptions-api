package com.p5.adoptions.model;

/**
 * An abstract class cannot be instantiated anymore!
 * Pluses over interface:
 * We can have fields private static, non-static, protected.
 * We can body to function.
 * We can abstract methods - interface methods.
 * constructors
 * <p>
 * minuses:
 * Limits inheritance, because we need to extend this in child, AND WE CAN ONLY EXTEND IT ONCE!
 */
public abstract class AbstractAnimal {
    /**
     * An abstract method allows a method without a body.
     *
     * @return
     */
    public abstract String whatDoesItEats();
}
