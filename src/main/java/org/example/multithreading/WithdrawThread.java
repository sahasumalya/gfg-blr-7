package org.example.multithreading;

public class WithdrawThread implements Runnable {
    public final Bank bank;
    public int amount;

    public WithdrawThread(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
       withdraw(amount);
    }

    public  void withdraw(int amount) {
       synchronized (bank) {
           while(bank.balance < amount){
               try {
                   System.out.println("Waiting for withdraw");
                   bank.wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }

           System.out.println("Withdrawing");
           bank.withdraw(amount);
       }
    }
}
