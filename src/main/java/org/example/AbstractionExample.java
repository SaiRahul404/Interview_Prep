package org.example;

public class AbstractionExample {
    public static void main(String[] args) {
        PaymentAbstract paymentAbstract = new CreditCardPaymentAbstract(2000.0, "23232332322333");
        paymentAbstract.pay();

        paymentAbstract = new PayPalPaymentAbstract(3000.0, "abc@gmail.com");
        paymentAbstract.pay();
    }
}

abstract class PaymentAbstract {
    double amount;

    // Constructor
    PaymentAbstract(double amount) {
        this.amount = amount;
    }

    PaymentAbstract() {
        this.amount = 20; // default value
    }

    // Abstract method (must be implemented by subclasses)
    abstract void pay();

    // Concrete method (already implemented, can be used as-is)
    void transactionSuccess() {
        System.out.println("Transaction of ₹" + amount + " completed successfully.");
    }
}

class CreditCardPaymentAbstract extends PaymentAbstract {
    String cardNumber;

    CreditCardPaymentAbstract(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing credit card payment using Card No: " + cardNumber);
        transactionSuccess();
    }

}


class PayPalPaymentAbstract extends PaymentAbstract {
    String email;

    PayPalPaymentAbstract(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    void pay() {
        System.out.println("Processing PayPal payment using Email: " + email);
        transactionSuccess();
    }


}
