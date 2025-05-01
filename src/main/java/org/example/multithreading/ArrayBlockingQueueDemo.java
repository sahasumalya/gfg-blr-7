package org.example.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo implements Runnable {

    private ArrayBlockingQueue<Integer> queue;

    public ArrayBlockingQueueDemo(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        this.queue.offer(1);
    }
}
