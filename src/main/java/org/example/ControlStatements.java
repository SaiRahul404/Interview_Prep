package org.example;

public class ControlStatements {
    public static void main(String args[]) {
        int month = 4; // April
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "Winter";  // If month is Dec, Jan, or Feb, it's Winter
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";  // If March, April, or May, it's Spring
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";  // If June, July, or Aug, it's Summer
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";  // If Sept, Oct, or Nov, it's Autumn
        else
            season = "Bogus Month"; // If the number is invalid, show error message

        System.out.println("April is in the " + season + ".");

        // The program checks month == 4.
        //It matches the condition month == 3 || month == 4 || month == 5.
        //So, it sets season = "Spring" and prints:
        //✅ Output:
        //April is in the Spring.
    }
}
