package org.example.multithreading;


// Creating thread by extendedning Thread class
public class Demo2Thread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }


}
