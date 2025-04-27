package org.example;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 0);
    }
}
// The code inside the do block runs at least once, even if the condition is false.
// The do-while loop executes at least once before checking the condition.
