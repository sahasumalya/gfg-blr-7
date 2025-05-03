package org.example.multithreading;

public class DepositThread implements Runnable {
    public final Bank bank;
    public int amount;

    public DepositThread(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            deposit(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void deposit(int amount) throws InterruptedException {
        synchronized (bank) {
            bank.deposit(amount);
//            bank.notify();
        }

    }
}
