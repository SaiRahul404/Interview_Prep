package org.example;

public class AbstractExample {
    // Abstract Method = A method that has been declared but not defined
    // (We just say "it exists," but we don’t explain how it works yet).
    // abstract void move();
    public static void main(String[] args) {
        Vehicle myCar = new CarAbstract();
        myCar.move();
        myCar.stop();

        myCar = new Boat();
        myCar.move();
        myCar.stop();

    }
}

abstract class Vehicle {
    // Abstract method (declared, but no body)
    abstract void move();

    // Regular method (with a body)
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}
// You cannot create an object of an abstract class.
// ❌ Vehicle v = new Vehicle(); ❌ → This will cause an error!
// Because Vehicle is incomplete (it has a missing move() method).
// We need specific vehicle types (like Car, Bike, or Boat) to complete it.

// We need subclasses to extend Vehicle and provide the missing move() method.
class CarAbstract extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves by driving on roads.");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("Boat moves by floating on water.");
    }
}

abstract class Airplane extends Vehicle {
    // This class is still abstract because it does not implement move()
}


// If a subclass does not provide an implementation for move(), it remains abstract too!

//  Can an Abstract Class Have Non-Abstract Methods?
//Yes! An abstract class can have both abstract and regular methods.
//Abstract methods (must be implemented by subclasses).
//
//
//Regular methods (already have a body and can be used as-is).

    //Abstraction means hiding unnecessary details and showing only the required features to the user.
// You drive a car 🚗 without worrying about how the engine works internally. You just use the steering wheel, accelerator, and brakes—the details of how they work are hidden from you. This is abstraction!


// An abstract class is like a template that provides general rules, but does not allow direct object creation.
// Instead, other subclasses must extend (inherit from) the abstract class and provide specific implementations for the abstract methods.

// Why Use Abstract Classes?
//1️⃣ To Provide a Common Template
//The abstract class defines the structure but does not provide all the details.
//
//
//This allows different child classes to provide their own implementations.
//
//
//2️⃣ To Enforce Certain Methods in All Subclasses
//If a method is abstract, all subclasses MUST override it.
//
//
//This ensures that all types of vehicles (cars, bikes, trucks) have a startEngine() method.
//
//
//3️⃣ To Promote Code Reusability
//The method stopEngine() is already defined in the Vehicle class.
//
//
//It is shared across all subclasses without needing to rewrite it.

// Abstraction = Hiding Details + Showing Only What’s Necessary
// ✅ Achieved using abstract classes and abstract methods
// ✅ Abstract classes act as blueprints but cannot be instantiated directly
// ✅ Subclasses must implement abstract methods to provide specific functionality
// ✅ Used in banking, games, e-commerce, and many real-world applications

