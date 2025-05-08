package org.example;



class Animal {

    protected String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is making sound");
    }
}

class GermanShepherd extends Dog {
    void duty() {
        System.out.println("On Duty");
    }
}
// Animal - > Dog // 1. **Single Inheritance**: A class inherits from only one superclass
//   - Example: `class B extends A`
//  **Hierarchical Inheritance**: Multiple classes inherit from one superclass
//   - Example: Both `class B` and `class C` extend `class A`
// Animal -> Dog -> GermanShepherd
/// . **Multilevel Inheritance**: A chain of inheritance
//   - Example: `class C extends B` and `class B extends A`

// Java **does not support multiple inheritance** (where a class inherits from multiple superclasses) through classes, but it can be achieved using interfaces.

// 1. **Code Reusability**: You don't need to rewrite the same code
//2. **Code Sharing**: Multiple classes can share common code from a parent
//3. **Increased Reliability**: Tested parent class code makes subclasses more reliable
//4. **Consistent Interface**: Related classes have similar methods
//5. **Rapid Prototyping**: Quickly build new classes from existing ones

class Parent {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 4;  // default
    private int privateVar = 3;

    public Parent() {
        System.out.println("Inside the Parent Constructor");
    }
}

class Child extends Parent {
    void display() {
        System.out.println(publicVar);    // OK
        System.out.println(protectedVar); // OK
         //System.out.println(privateVar); // Error - private
        System.out.println(defaultVar);   // OK if same package
    }
    public Child() {
        System.out.println("Inside the Child Constructor");
    }
}

public class InheritanceExample {
    // Inheritance is a mechanism where a new class (called the **subclass** or **child class**) can be created based on an existing class (called the **superclass** or **parent class**).
    // - **Superclass/Parent class/Base class**: The existing class being inherited from
    //- **Subclass/Child class/Derived class**: The new class that inherits from the superclass
    public static void main(String[] args) {
//        Dog newDog = new Dog(); // Created a dog Object
//        newDog.eat();
//        newDog.name = "Raichu";
//        newDog.bark();
//        Cat newCat = new Cat();
//        newCat.eat();
//        newCat.meow();
//        GermanShepherd newG = new GermanShepherd();
//        newG.eat();
//        newG.bark();
//        newG.duty();
        //Child child1 = new Child();
        Parent parent1 = new Parent();
    }
}