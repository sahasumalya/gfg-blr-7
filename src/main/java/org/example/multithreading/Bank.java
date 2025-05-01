package org.example.multithreading;

public class Bank {

    public int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount)  {
        balance -= amount;

    }
}
