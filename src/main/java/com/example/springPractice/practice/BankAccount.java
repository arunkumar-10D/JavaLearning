package com.example.springPractice.practice;

public class BankAccount {
    private String accountHolder;
    private final String accountNumber; // final → cannot be changed once assigned
    private double balance;


    private static double interestRate = 5.0; // common interest rate
    private static int totalAccounts = 0;


    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance = " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }


    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public static void showBankInfo() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Arun", "A1001", 5000);
        BankAccount acc2 = new BankAccount("Kumar", "A1002", 8000);


        acc1.deposit(2000);
        acc1.withdraw(1000);

        acc2.withdraw(9000);


        System.out.println(acc1.getAccountHolder() + " Balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " Balance: " + acc2.getBalance());


        BankAccount.showBankInfo();
    }
}
