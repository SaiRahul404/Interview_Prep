package org.example;

class Bank {
    static double interestRate;

    // Static block to initialize interest rate
    static {
        interestRate = 7.5;  // Setting static variable before main runs
        System.out.println("Interest Rate Initialized: " + interestRate + "%");
    }

    public static void main(String[] args) {
        System.out.println("Bank Application Started!");
    }
}
