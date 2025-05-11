package org.example;

public class FinalExample {
    // The final keyword in Java is used to restrict changes in different ways.
    // It can be used with variables, methods, and classes for different purposes.

    // final to Create Constants
    // Prevents the variable value from being changed once assigned.
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.speedLimit();
        BankFamous bankFamous = new BankFamous();
        //bankFamous.INTEREST_RATE = 7.0; // Error! Cannot change final variable
    }

}

class BankFamous {
    final double INTEREST_RATE = 5.0; // Cannot be changed
    // final variables must be initialized when declared.
    // Once assigned, the value CANNOT be changed.
}

class CarFamous {
    //  final to Prevent Method Overriding
    //  Purpose: Prevents a subclass from changing (overriding) a method.
    final void speedLimit() {
        System.out.println("Speed limit is 100 km/h.");
    }
}

class SportsCar extends CarFamous {
//     void speedLimit() {
//         System.out.println("Speed limit is 200 km/h.");
//     }
}

// Marking a method final ensures its logic cannot be modified in subclasses.
// Useful for important business rules that should remain unchanged.

final class GovernmentID {
    void displayID() {
        System.out.println("Government ID cannot be modified.");
    }
}
// Prevents other classes from inheriting (extending) the class.
//class FakeID extends GovernmentID {
// }

// Marking a class final ensures nobody can extend (modify) it.
// Useful for security-sensitive classes like IDs, payments, etc.

// final keyword is used for security, reliability, and consistency.
// ✅ Prevents accidental changes in important data, methods, or classes.
// ✅ Ensures some rules stay fixed across the application.

// Payment (Super Class): Represents a general payment.
//
//
//CreditCardPayment (Subclass): Extends Payment and overrides the processPayment() method.
//
//
//UPIPayment (Subclass): Another subclass of Payment that implements UPI-based payments.
//
//
//BankTransfer (Final Class): A final class that cannot be extended further (for security reasons).
// real-world example of an online payment system used in e-commerce apps like Amazon, Flipkart, or PayPal.

// processPayment() - non final
//  generateReceipt() - final

