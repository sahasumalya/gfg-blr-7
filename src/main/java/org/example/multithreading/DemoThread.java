package org.example.multithreading;

public class DemoThread implements Runnable {


    @Override
    public void run() {
        printNumbers();


    }

    public static synchronized void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
