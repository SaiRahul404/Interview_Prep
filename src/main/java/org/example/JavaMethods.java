package org.example;

public class JavaMethods {
    public static void greet(int value) {
        System.out.println("Hello, welcome to Java! " + value);
    }

    public static void main(String[] args) {
        greet(9); // Calling the method
    }
}


// access_modifier return_type method_name(parameters) {
//    // Method body
//    return value; // Optional, depends on return_type
//}

// 1.public - Accessible from anywhere.
//2.private - Accessible only within the same class.
//3.protected - Accessible within the same package and subclasses.

// 1.If a method does not return anything, it should be defined with void.