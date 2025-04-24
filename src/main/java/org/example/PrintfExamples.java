package org.example;

public class PrintfExamples {
    public static void main(String[] args) {

        // 1. Printing integers
        int age = 25;
        System.out.printf("Age: %d\n", age); // %d → decimal integer

        // 2. Printing floating-point numbers
        double price = 19.99;
        System.out.printf("Price: %.2f\n", price); // %.2f → 2 decimal places

        // 3. Printing strings
        String name = "Alice";
        System.out.printf("Hello, %s!\n", name); // %s → string

        // 4. Printing characters
        char grade = 'A';
        System.out.printf("Grade: %c\n", grade); // %c → character

        // 5. Padding numbers with spaces
        int number = 123;
        System.out.printf("Right aligned: %6d\n", number); // 6-width space

        // 6. Padding numbers with zeros
        System.out.printf("Zero padded: %06d\n", number); // padded with 0s

        // 7. Left alignment
        System.out.printf("Left aligned: %-6dDone\n", number); // '-' = left align

        // 8. Printing multiple values
        String item = "Pen";
        int qty = 3;
        double cost = 5.25;
        System.out.printf("Item: %s | Qty: %d | Cost: $%.2f\n", item, qty, cost);

        // 9. Formatting percentage
        double percentage = 0.8765;
        System.out.printf("Success Rate: %.2f%%\n", percentage * 100); // %% to print %

        // 10. Formatting hexadecimal and octal
        int value = 255;
        System.out.printf("Decimal: %d, Hex: %x, Octal: %o\n", value, value, value); // %x: hex, %o: octal
    }
}

