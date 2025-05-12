package org.example;

public class PaymentMain{
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(5000, "1234567812345678");
        Payment payment2 = new UPIPayment(1500, "user@upi");
        Payment payment3 = new BankTransfer(10000, "9876543210");

        System.out.println("\n--- CREDIT CARD PAYMENT ---");
        payment1.processPayment();
        payment1.generateReceipt(); // This method is final

        System.out.println("\n--- UPI PAYMENT ---");
        payment2.processPayment();
        payment2.generateReceipt(); // Final method from superclass

        System.out.println("\n--- BANK TRANSFER ---");
        payment3.processPayment();
        payment3.generateReceipt(); // Final method from superclass



    }
}

class Payment {
    double amount;

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Method to be overridden
    void processPayment() {
        System.out.println("Processing payment of ₹" + amount);
    }

    // Final method to prevent modification
    final void generateReceipt() {
        System.out.println("Receipt generated for ₹" + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    // Constructor
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount); // Calls superclass constructor
        this.cardNumber = cardNumber;
    }

    // Overriding processPayment method
    @Override
    void processPayment() {
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Card Number: XXXX-XXXX-XXXX-" + cardNumber.substring(12)); // Masking card details
    }
}

class UPIPayment extends Payment {
    String upiID;

    // Constructor
    public UPIPayment(double amount, String upiID) {
        super(amount); // Calls superclass constructor
        this.upiID = upiID;
    }

    // Overriding processPayment method
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("UPI ID: " + upiID);
    }
}

final class BankTransfer extends Payment {
    String bankAccount;

    // Constructor
    public BankTransfer(double amount, String bankAccount) {
        super(amount); // Calls superclass constructor
        this.bankAccount = bankAccount;
    }

    // Overriding processPayment method
    @Override
    void processPayment() {
        System.out.println("Processing Bank Transfer of ₹" + amount);
        System.out.println("Bank Account: XXXX" + bankAccount.substring(bankAccount.length() - 4)); // Masking account details
    }
}

//class SecureBankTransfer extends BankTransfer {
//
//}





