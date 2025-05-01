package org.example;

import org.example.generics.Company;
import org.example.generics.CustomGenerics;
import org.example.multithreading.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Runnable runnable = new DemoThread();
        Thread thread1 = new Thread(new DemoThread());
        Thread thread2 = new Thread(new DemoThread());
        thread1.start();
        thread2.start();
        thread1.join();*/

        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
      //  ThreadGroup threadGroup1 = new ThreadGroup(threadGroup, "ThreadGroup1");


        /*Bank bank = new Bank(0);
        WithdrawThread withdrawThread = new WithdrawThread(bank, 100);
        DepositThread depositThread = new DepositThread(bank, 50);
        DepositThread depositThread2 = new DepositThread(bank, 50);

        Thread t1 = new Thread(withdrawThread);
        Thread t2 = new Thread(depositThread);
        Thread t3 = new Thread(depositThread2);
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(5000);
        t3.start();*/
        /*ReentrantLock lock = new ReentrantLock();
        Thread thread1 = new Thread(new PrintingNumbers(lock));
        Thread thread2 = new Thread(new PrintingNumbers(lock));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();*/
        /*ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                try {
                    System.out.println(queue.offer(i, 5, TimeUnit.SECONDS)+" adding");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                try {
                    System.out.println(queue.poll(5, TimeUnit.SECONDS)+" removing");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        thread1.start();
        thread.start();
        thread.join();
        thread1.join();*/
        /*ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new ExecutorTask(i));
        }
        Thread.sleep(10000);
        executorService.shutdown();
        */
        //CustomGenerics<Company> customGenerics = new CustomGenerics<>(new Company("dd","fd","df","dfgd"));
       // System.out.println(customGenerics.getAddress());
        System.out.println("Hello, World!");
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(integers.parallelStream().reduce(1, (x, y) -> x * y));






    }

}