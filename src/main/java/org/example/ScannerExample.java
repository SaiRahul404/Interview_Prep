package org.example;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // creating a object for the Scanner class
        System.out.print("Enter your name: ");
        String name = obj.nextLine();
        System.out.print("Enter your age: ");
        int age = obj.nextInt();
        System.out.println("Hello " + name + ", your age is " + age);
        obj.close(); // // Step 4: Close the scanner (Good practice)
    }
}

//Method | Description
//nextInt() | Reads an int value
//nextFloat() | Reads a float value
//nextDouble() | Reads a double value
//next() | Reads a single word (till space)
//nextLine() | Reads the full line (including spaces)
//nextBoolean() | Reads a boolean value (true/false)
//nextLong() | Reads a long value
