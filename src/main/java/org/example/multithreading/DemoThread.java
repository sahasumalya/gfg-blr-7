package org.example.multithreading;


// creating thread by implementing runnable interface
public class DemoThread implements Runnable {

    public NumberPrinting numberPrinting;

    public DemoThread(NumberPrinting numberPrinting) {
        this.numberPrinting = numberPrinting;
    }

    @Override
    public void run() {
        numberPrinting.printNumber();


    }


}
