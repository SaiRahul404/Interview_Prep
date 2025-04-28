package org.example;

public class InvertedPattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {         // Outer loop → rows decreasing
            for (int j = 1; j <= i; j++) {     // Inner loop → stars equal to row number
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {          // Outer loop → rows
            for (int j = 1; j <= i; j++) {      // Inner loop → print numbers from 1 to row number
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
// i = 4 -> j = 1 to j< =4 -> (4)
//  i = 3 -> j = 1 to j< =3 -> (3)
// i = 2 -> j = 1 to j< =2 -> (2)
// i = 1 -> j = 1  -> (1)

//        * * * *
//        * * *
//        * *
//        *

// 1
// 1 2
// 1 2 3
// 1 2 3 4

// Concept | Meaning
//Outer Loop | Controls rows (up and down movement)
//Inner Loop | Controls columns (left and right movement)
//System.out.print() | Prints on the same line
//System.out.println() | Moves to next line after finishing a row

//Rows = outer loop
//
//Columns = inner loop
//
//Decide what to print (e.g., *, numbers)
//
//Decide how many times to print in each row
