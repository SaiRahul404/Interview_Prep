package org.example;

public class Demo {
    public static void main(String[] args) {
        AnimalDispatch a;  // Superclass reference

        a = new DogDispatch();  // Dog object
        a.sound();      // Outputs: Dog barks

        a = new CatDispatch();  // Cat object
        a.sound();      // Outputs: Cat meows
    }
}
//  A reference variable of the superclass.
//  Reference a points to a DogDispatch object.

// a.sound();
//→ Even though a is of type Animal, the actual object is Dog, so Dog's sound() method is called

// Same logic for Cat.
// Helps build flexible and scalable code.
class AnimalDispatch {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogDispatch extends AnimalDispatch {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatDispatch extends AnimalDispatch {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
