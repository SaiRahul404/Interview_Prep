package org.example.util;

public class ECommerceApp {
    public static void main(String[] args) {
        PaymentGateway payment; // refrence

        payment = new CreditCardPayment();
        payment.pay(500.00);

        payment = new UpiPayment();
        payment.pay(250.00);
    }

}

interface PaymentGateway {
    void pay(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UpiPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}


