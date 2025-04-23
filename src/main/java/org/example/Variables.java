package org.example;

public class Variables {

    // A variable is a container that stores data in a program.
    byte smallNumber = 50; // -128 to 127 // 1byte
    short mediumNumber = 2000; // -32,768 to 32,767 // 2bytes
    int normalNumber = 100000; // -2 billion to 2 billion // 4bytes
    long bigNumber = 10000000000L; // Huge Numbers // 8 bytes

    long newNumber = 1L;

    float pi = 3.14F;
    float number = 0.34F; // 6 decimalPlaces // 4bytes
    double big = 0.00000000034; // 15 decimal places // 8 bytes

    float price = 9.99F;  // Use 'F' for float
    double precisePrice = 9.99999999; // No need for 'D'

    char letter = 'A'; // Must be inside single quotes (' ').
    char symbol = '1'; // 2bytes
    char numberAsChar = '5'; //// Stored as a character, not a number!

    boolean isJavaFun = true; // True
    boolean isTired = false;

    short num = 130;
    //If you don’t assign a value, Java assigns a default:
    int x; // Default is 0 // byte, short, int, long
    float y; // 0.0
    boolean isJavaFun1; // // Default is false

    // Unicode is a universal character encoding standard.

    // It includes:
    //
    //English letters (A, B, C)
    //
    //Digits (0-9)
    //
    //Special characters (@, #, $)
    //
    //Characters from other languages (like ह, 中, ع)
    //
    //Emojis (😀, ❤️, etc.)

    // Character | Unicode
    //A     |           U+0041
    //a |           U+0061
    //$ |           U+0024
    //ह |           U+0939
    //中 |           U+4E2D
}
