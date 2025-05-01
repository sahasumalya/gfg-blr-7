package org.example.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class PrintingNumbers  implements Runnable {
    public PrintingNumbers(ReentrantLock lock) {
        this.lock = lock;
    }

    ReentrantLock lock;

    public void generateNumbers() throws InterruptedException {
        while(!lock.tryLock());


        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        Thread.sleep(5000);
        lock.unlock();
    }

    @Override
    public void run() {
        try {
            generateNumbers();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
