package org.example;

public class StaticMethodExample {
    //  Can be called without creating an object of the class.
    // Can access static variables but not non-static variables directly.
    public static void main(String[] args) {
        // Calling static method without creating an object
        Mobile.showOS(); // ✅ Correct usage

        // Creating objects to call non-static methods
        Mobile m1 = new Mobile("Samsung S21", 800);
        Mobile m2 = new Mobile("OnePlus 9", 600);

        m1.showDetails(); // ✅ Correct usage
        m2.showDetails(); // ✅ Correct usage
    }
}

class Mobile {
    String model;  // Instance variable (Non-static)
    int price;     // Instance variable (Non-static)
    static String OS = "Android"; // Static variable (Same for all mobiles)

    // Constructor
    Mobile(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // Static Method
    static void showOS() {
        System.out.println("Operating System: " + OS);
    }

    // Non-Static Method
    void showDetails() {
        System.out.println(model + " - $" + price);
    }
}
// The static method showOS() is called using Mobile.showOS(), without creating an object.
// The non-static method showDetails() is called using an object

// Static methods belong to the class, while non-static variables belong to objects. Since a class doesn’t know which object’s data to use, it cannot access instance (non-static) variables directly.

// The main() method in Java is always static because:
//✅ It allows Java to call main() without creating an object of the class.
//✅ If main() were non-static, Java wouldn’t know which object to use to start the program.