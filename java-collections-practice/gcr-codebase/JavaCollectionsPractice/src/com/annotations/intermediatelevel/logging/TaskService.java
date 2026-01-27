package com.annotations.intermediatelevel.logging;

public class TaskService {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1_000_000; i++);
    }

    @LogExecutionTime
    public void slowTask() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void normalTask() {
        System.out.println("Normal task (not logged)");
    }
}
