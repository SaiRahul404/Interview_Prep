package org.example;

public class OverloadingExample {
    // complie-time polymorphisim
    // Method Overloading
    // single Name but muliple usues
    // In Java, we can have multiple methods with the same name in a class but with different parameters (number, type, or both).
    // Imagine you have a universal remote control 🎛️ that can control TV, AC, and a music system.

    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

 class OverloadingExampleTest {
    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();
        System.out.println(overloadingExample.add(2,3));
        System.out.println(overloadingExample.add(2.1,3.5));
        System.out.println(overloadingExample.add(2,3,7));

    }
    // Java decides which add() method to call based on the number and type of arguments.
     // No need for different method names (like addInt(), addFloat())—just overload add().
}
