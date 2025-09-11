package oop;

public class Account {
    // Private variables to store account details
	//Encapsulation
	
    private String accountNumber;
    private double balance;

    // Constructor to initialize account
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money into account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public method to withdraw money from account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal");
        }
    }

    public static void main(String[] args) {
        // Create an Account object
        Account account = new Account("12345678", 1000.0);

        // Access account details using public methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Perform deposit and withdrawal operations
        account.deposit(500.0);
        System.out.println("Updated Balance: " + account.getBalance());

        account.withdraw(300.0);
        System.out.println("Updated Balance: " + account.getBalance());

        account.withdraw(1500.0); // Attempt to withdraw more than the balance
    }
}