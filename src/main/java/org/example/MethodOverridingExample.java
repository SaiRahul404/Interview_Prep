package org.example;

public class MethodOverridingExample {
    //When a subclass provides a specific implementation of a method that is already defined in its superclass.
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1(); // object for cat class
        cat1.makeSound();
        cat1.eat();
        Animal1 animal1 = new Cat1(); // object for cat class
        animal1.makeSound();
        cat1.eat();
    }
}

class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class Cat1 extends Animal1 {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

//  Must have same name and parameters as parent method
//  Return type should be same