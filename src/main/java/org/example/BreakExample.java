package org.example;

class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Stop the loop when i == 3
            }
            System.out.println("Iteration: " + i);
        }
    }
}
