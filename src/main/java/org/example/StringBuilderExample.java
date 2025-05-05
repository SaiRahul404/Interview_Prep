package org.example;

public class StringBuilderExample {
    // In Java, Strings are immutable, meaning their values cannot be changed once created.

    // But sometimes, we need to modify Strings frequently (e.g., appending, inserting, or deleting characters).

    //  StringBuilder
    //✔ StringBuffer
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); // Single-threaded programs
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb); // Output: Hello World

        StringBuffer sb1 = new StringBuffer("Hello"); // Multi-threaded programs
        sb1.append(" World"); // Modifies the existing object
        System.out.println(sb1); // Output: Hello World

        StringBuffer balance = new StringBuffer("Account Balance: $1000");

        // Two users trying to update balance at the same time
        balance.append(" -> Deposited $500");
        balance.append(" -> Withdrawn $200");

        System.out.println(balance);

        StringBuilder score = new StringBuilder("Score: 0");


        // Player earns points
        score.append(" -> +10 points");
        score.append(" -> +20 points");

        System.out.println(score);
    }
    }
    //  StringBuilder Faster than StringBuffer
    //  Fast and Efficient:

// Use StringBuffer when multiple threads modify the same string (e.g., Banking, Online Bookings).
//✔ Use StringBuilder when only one thread modifies the string (e.g., Games, User Input Processing).
//✔ Both are faster than String for modifying text.



