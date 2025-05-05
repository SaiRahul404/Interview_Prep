package org.example;

class StaticDemo {
    static int value;

    // Static Block
    static {
        value = 100;
        System.out.println("Static Block Initialized: " + value);
    }

    // Static Method
    static void showValue() {
        System.out.println("Static Method Value: " + value);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed!");
        showValue();
    }
}
