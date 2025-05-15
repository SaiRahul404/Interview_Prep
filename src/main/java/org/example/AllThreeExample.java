package org.example;

public class AllThreeExample {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Underage - Not allowed");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) throws InsufficientFundsException {
        try {
            checkAge(15);
            checkAge(19);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        try {
            ExampleException exampleException = new ExampleException();
            exampleException.withdraw(699.0);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Exception Occured " + e.getMessage());
        }


    }



}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }

}

class ExampleException {
    void withdraw(double amount) throws InsufficientFundsException {
        double balance = 100;
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance!");
        }
    }
}

