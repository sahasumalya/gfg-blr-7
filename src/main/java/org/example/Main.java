package org.example;

import org.example.generics.Company;
import org.example.generics.CustomGenerics;
import org.example.multithreading.*;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Thread and Process
         * 2. Parallel and concurrent
         * 3. Creation of Threads in Java
         * 4. Thread lifecycle
         * 4. Thread group, thread synchronisation
         * 5. ExecutorService
         * 6.
         *
         *
         *
         *
         *
         *
         *
         * 1. Thread Priority
         *  Norm-priotoyy-- 5
         *  Maxpriority -10
         *  min priority - 0
         */


        /**
         *
         *
         * Synchromisations
         *
         * 1. Method level
         * 2. Block level
         * 3. Class level synchronisation
         * 4.Object level synchronisation
         **/

         /* List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        ///    1  2  3
        Iterator<Integer> iterator1 = integers.iterator();
        while (iterator1.hasNext()) {
            integers.add(4);
            System.out.println(iterator1.next());
        }*/

        /*Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(8);

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }*/
        /*Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set.add(2);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(8);
        set.add(6);
        set.add(3);

        //Thread thread1 = new Demo2Thread();


        /*Runnable runnable1 = new DemoThread(new NumberPrinting());
        Runnable runnable2 = new DemoThread(new NumberPrinting());

        Thread thread2 = new Thread(runnable1);
        Thread thread1 = new Thread(runnable1);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("hello world");

        //  1. idle, 2. runnable ---


         */
        /*ReentrantLock lock = new ReentrantLock();
        Thread lockThread = new Thread(new LockDemo(lock));
        Thread lockThread2 = new Thread(new LockDemo(lock));

        lockThread.start();
        lockThread2.start();

        /*Runnable runnable = new DemoThread();
        Thread thread1 = new Thread(new DemoThread());
        Thread thread2 = new Thread(new DemoThread());
        thread1.start();
        thread2.start();
        thread1.join();*/

        //ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
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
        t3.start();
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
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.get(1);
        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
        ThreadGroup child = new ThreadGroup(threadGroup, "ThreadGroup1");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            executorService.submit(new ExecutorTask(i));
        }
        executorService.shutdown();
        while(!executorService.awaitTermination(60, TimeUnit.SECONDS)){
            executorService.shutdownNow();
        }


        //CustomGenerics<Company> customGenerics = new CustomGenerics<>(new Company("dd","fd","df","dfgd"));
       // System.out.println(customGenerics.getAddress());
        //System.out.println("Hello, World!");
        //List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //System.out.println(integers.parallelStream().reduce(1, (x, y) -> x * y));






    }

}