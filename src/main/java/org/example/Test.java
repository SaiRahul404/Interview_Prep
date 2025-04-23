package org.example;

class Student {
    String name;
    int rollNumber;

    void printHelloWorld() {
        // we need object creation
        System.out.println("Hello world!");
    }

    static void printHi() {
        // No object creation neede
        System.out.println("Hi");
    }
}


public class Test {
    public static void main(String[] args) {

        Student.printHi();
        Student student1 = new Student();
        student1.printHelloWorld();
//        // student1 is an object of Student class.
//        Student student2 = new Student();
//        // student2 is an object of Student class
    }
}
// Class - Blueprint for objects
// Object - Instance of a class