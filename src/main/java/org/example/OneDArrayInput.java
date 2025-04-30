package org.example;
import java.util.Scanner;

public class OneDArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) { // storing the values in the array
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        // enhanced for loop
        for (int num : numbers) { // printing the values from the array
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

// Takes the array size from the user

// Accepts each element using a loop.

// Prints the array using an enhanced for loop
