package org.example;

 class BankAccountEnc {
    // Encapsulation means hiding the internal details of an object and only exposing the necessary parts through methods.
    // It ensures: ✅ Data protection (Prevents unauthorized access)
    //✅ Data integrity (Avoids accidental modifications)
    // ✅ Controlled access (Allows modifications through methods only)
    private double balance; //  // Private variable (cannot be accessed directly)

    public BankAccountEnc(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    //getter method
    public double getBalance() {
        return balance;
    }

}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccountEnc myAccount = new BankAccountEnc(1000);  // Initial balance is 1000
        myAccount.deposit(500);  // Depositing 500
        System.out.println("Current Balance: " + myAccount.getBalance());  // Checking balance
    }
    // balance is private and cannot be accessed directly.
    //deposit() method allows safe deposits.
    //getBalance() method retrieves the balance safely.
}
// Protects Sensitive Data (e.g., Bank account balance, Passwords)
//2️⃣ Prevents Accidental Changes (e.g., Prevents direct balance modification)
//3️⃣ Provides Controlled Access (e.g., Only deposit() method can modify balance)
//4️⃣ Increases Code Maintainability (e.g., Can change implementation without affecting users)
