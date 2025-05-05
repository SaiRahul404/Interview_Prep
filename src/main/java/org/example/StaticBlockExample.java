package org.example;

public class StaticBlockExample {
    // Runs before the main() method (without needing an object).
    //  Used to initialize static variables or perform setup tasks before execution starts.
    // A class can have multiple static blocks, and they run in the order they appear.
    static {
        System.out.println("Static Block Executed!");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Executed!");
    }
}

// The static block runs first, before the main() method.
//✔ Why? Because when the class is loaded, Java first executes the static block before anything else.