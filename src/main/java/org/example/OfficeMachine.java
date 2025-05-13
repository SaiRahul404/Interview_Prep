package org.example;

public class OfficeMachine {
    public static void main(String[] args) {
        PrinterScanner device = new PrinterScanner();
        device.print();
        device.scan();
    }

}

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class PrinterScanner implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

    // Interfaces only have abstract methods (before Java 8)

interface RemoteControl {
    void powerOn();   // No implementation
    void powerOff();
}
//  A remote control has buttons (methods), but it doesn’t decide what happens when you press them—your device (TV, AC) does.

// From Java 8 onwards, interfaces can have default and static methods
interface Device {
    default void start() {
        System.out.println("Starting device (default)");
    }

    static void serviceInstructions() {
        System.out.println("Follow user manual to service.");
    }
    void powerOff();
}

interface TrafficRules {
    int MAX_SPEED = 80;  // implicitly public, static, and final
    void followSignal();

    // They are constants — like rules written in stone.
    //Real-life analogy: A traffic light system – red means stop, green means go. These are fixed values.
}

interface MyInterface {
    default void show() {
        System.out.println("This is a default method.");
    }
}

// Use the default keyword.
//
//Can have a method body.
//
//Classes that implement the interface can override the default method

interface HousePlan {
    void buildWalls();
    void buildRoof();
    // no constructors or instance variables allowed
}

// You cannot create objects of an interface directly



