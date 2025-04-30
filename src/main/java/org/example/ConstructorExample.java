package org.example;

public class ConstructorExample {
    public static void main(String[] args) {
        CarNew newCar = new CarNew(); // object creation
        CarNew secondCar = new CarNew();
        newCar.speed = 120;
        secondCar.speed = 200;
        // // Constructor is automatically called
        newCar.honk();
        secondCar.honk();
    }
}
// newCar                            // secondCar
// brand : Alto                     // brand  : Alto
//speed   : 120                    //speed : 200
//color   : Red                     //color : Red
// honk()                              // honk()

class CarNew {
    String brand;
    int speed;
    String color;

    CarNew () { // default constructor
        brand = "Alto";
        speed = 100;
        color = "Red";
        System.out.println("Object Created");
    }

    public void honk() {
        System.out.println(brand + " is honking! " + speed);
    }
}
