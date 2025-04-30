package org.example;

class Car {
    // Instance variables (Attributes)
    String brand;
    int speed;
    String color;

    public void honk() {
        System.out.println(brand + " is honking! " + speed);
    }

    public static void printHello() { // static method
        System.out.println("Hello World");
    }


}


public class CarMain {
    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.brand = "Alto";
        carObj.speed = 100;
        carObj.color = "Blue";
        Car secondCar = new Car();
        secondCar.brand = "Toyato";
        secondCar.speed = 200;
        secondCar.color = "Red";
        carObj.honk();
        secondCar.honk();
        Car.printHello();
    }
}

// carObj                            // secondCar
// brand : Alto                     // brand  : Toyato
//speed   : 100                    //speed : 200
//color   : Blue                     //color : Red
// honk()                              // honk()


// printHello it belongs to the class
// You can create multiple objects from the same class, each with unique values.
// Each object has its own independent set of variables.