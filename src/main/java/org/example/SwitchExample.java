package org.example;

public class SwitchExample {
    public static void main(String args[]) {
        int choice = 2; // User selects button 2
        String snack;

        switch (choice) {
            case 1:
                snack = "You got a Coke.";
                break;
            case 2:
                snack = "You got a Chocolate Bar.";
                break;
            case 3:
                snack = "You got a Bag of Chips.";
                break;
            case 4:
                snack = "You got a Bottle of Water.";
                break;
            default:
                snack = "Invalid choice. Please select again.";
        }

        System.out.println(snack);
    }
}

