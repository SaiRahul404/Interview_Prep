package org.example;

public class InterfaceExample {
    //  Java Does Not Support Multiple Inheritance with Classes

    // This is not allowed in Java:
    //// ❌ This is NOT allowed in Java
    //class A {
    //    void show() {}
    //}
    //
    //class B {
    //    void show() {}
    //}
    //
    //// ❌ Compile-time error
    //class C extends A, B {
    //}

    // Ambiguity Problem:
    // If both A and B have a method called show(), which one should class C inherit? Java avoids this confusion

    // Java uses interfaces to achieve multiple inheritance safely.

    // An interface is like a contract that says: “Whoever uses me must implement these methods.”

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }

}

interface sampleInterface {
    // abstract methods
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();

    void fly();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

// No confusion, because interfaces don’t have method bodies, so Java knows what to do.
// Interfaces are Java’s smart solution to allow multiple inheritance without confusion.

interface InterfaceName {
    void method1();
    void method2();
}



