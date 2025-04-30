package org.example;

public class ConstructorExample {
    public static void main(String[] args) {
        CarNew newCar = new CarNew(); // object creation // default constructor
        CarNew secondCar = new CarNew("Toyato", 35, "Violet"); // parametrized constructor
        CarNew thirdCar = new CarNew("BMW",200,"Green");
        CarNew fourthCar = new CarNew("Hyundai");

        CarNew fifthCar; // reference

    }
}


class CarNew {
    String brand;
    int speed;
    String color;

    CarNew () { // default constructor // No args constructor
        this.brand = "Alto";
        this.speed = 100;
        this.color = "Red";
        System.out.println("Object Created");
        this.honk();
    }

    CarNew (String brand, int speed, String color) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
        System.out.println("Object Created in paramterized Constructor");
        this.honk();
    }

    CarNew (String brand) {
        this.brand = brand;
        this.speed = 100;
        this.color = "green";
        this.honk();
    }

    public void honk() {
        System.out.println(brand + " is honking! " + speed);
    }
}

// The this keyword is used to refer to the current object’s instance variables

// . It helps avoid confusion when parameter names match instance variable names.
// Java prioritizes local variables, so brand = brand; doesn’t work as expected

// You can also use this to call a method inside a constructor.
//  method is called automatically when an object is created.