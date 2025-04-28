package org.example;

public class ArraysInJava {
    // An array is a collection of multiple values of the same type stored together in memory.
    int mathsMarks;
    int scienceMarks;
    int englishMarks;
    int hindiMarks;
    int teluguMarks;
    // Instead of creating multiple variables, we use an array to store them in a structured way.

    // Imagine you are keeping track of the scores of 5 students in a test

    public static void main(String[] args) {

        int[] scoresOfJohn = {85, 90, 78, 92, 88};
        System.out.println(scoresOfJohn[0]);
        System.out.println(scoresOfJohn[3]);

        int[] numbers;
        numbers = new int[3]; // size-3
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // In Java, the first element starts at index 0 instead of 1.

        int[] nums = {5, 10, 15};
        System.out.println(nums[0]);  // Output: 5
        System.out.println(nums[1]);  // Output: 10
        System.out.println(nums[2]);
        //System.out.println(nums[3]); // Index out of bounds

        int[] values = {3, 6, 9, 12};

        for (int i = 0; i < values.length; i++) { // i=0,i=1,i=2,i=3
            System.out.println("Element at index " + i + ": " + values[i]);
        }
        for (int i = 0; i < values.length; i++) { // i=0,i=1,i=2,i=3
            System.out.println(values[i]);
        }
        System.out.println(values.length);
    }
}
