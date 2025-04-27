package org.example;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

// i = 1 -> j = 1 to j < = 1 (1)
// i = 2 -> j = 1 to j <= 2 (2)
// i = 3 -> j = 1 to j <= 3 (3)
// i = 4 -> j = 1 to j <= 4 (4)
// i = 5 -> j = 1 to j <= 5 (5)

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *