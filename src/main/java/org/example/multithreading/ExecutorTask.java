package org.example.multithreading;

public class ExecutorTask implements Runnable{

    private int taskId;

    public ExecutorTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Executing task"+ Thread.currentThread().getName()+ "taskid-"+taskId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
