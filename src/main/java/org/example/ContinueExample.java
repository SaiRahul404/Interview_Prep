package org.example;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip iteration when i == 3
            }
            System.out.println("Iteration: " + i);
        }
    }
}
// The continue statement skips the current iteration and moves to the next one.