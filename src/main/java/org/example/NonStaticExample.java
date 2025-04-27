package org.example;

public class NonStaticExample {
    public int add(int a, int b) {
        return a + b;
    } // non - static method

    public static int addNumbers(int a, int b) {
        return a + b;
    }// static method

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample(); // creation of an object
        System.out.println(obj.add(5, 3)); // to call an non static method we should create an object
        System.out.println(addNumbers(5,3)); // to call an static method we do not need any object

    }
}

class AnotherExample {

    public void sampleMethod() {
        NonStaticExample newObj = new NonStaticExample();
        newObj.add(4,5);
        NonStaticExample.addNumbers(4,5);
    }
}
