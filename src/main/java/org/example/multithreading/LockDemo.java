package org.example.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {

    public ReentrantLock lock;

    public LockDemo(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while(!lock.tryLock()){
            System.out.println("Lock unable to aquire "+Thread.currentThread().getName());
        }
      for (int i = 0; i < 10; i++) {
          System.out.println(Thread.currentThread().getName() + " " + i);
      }
      lock.unlock();
    }
}
