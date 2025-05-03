package org.example.multithreading;

public class NumberPrinting {

    public void printNumber() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }

    }
}
