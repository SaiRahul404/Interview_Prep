package org.example;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            // This will throw an ArrayIndexOutOfBoundsException
            System.out.println(numbers[0]);
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }

        try {
            int a = 10;
            int b = 1;
            int result = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        //  (The program won't crash and will continue running smoothly.)
        finally {
            // This block will always execute
            System.out.println("Execution completed.");
        }
        // he `finally` block is optional and is used to execute code after the `try` and `catch` blocks, regardless of whether an exception was thrown or not. It is often used for cleanup activities, such as closing resources.

        try {
            int result = 10 / 0; // Error: Division by zero
            int num = Integer.parseInt("XYZ"); // Error: Not a number
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        // (Only the first exception is caught and handled.)


    }

}
