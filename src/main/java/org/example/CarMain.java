package org.example;

class Car {
    // Instance variables (Attributes)
    String brand;
    int speed;
    String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
        carObj.setBrand("Alto");
        carObj.setSpeed(100);
        System.out.print(carObj.getBrand());
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