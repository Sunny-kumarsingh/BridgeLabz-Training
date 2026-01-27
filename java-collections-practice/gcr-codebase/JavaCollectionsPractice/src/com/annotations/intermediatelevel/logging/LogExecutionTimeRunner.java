package com.annotations.intermediatelevel.logging;

import java.lang.reflect.Method;

public class LogExecutionTimeRunner {

    public static void main(String[] args) {

        try {
            TaskService service = new TaskService();
            Class<?> cls = service.getClass();

            for (Method method : cls.getDeclaredMethods()) {

                if (method.isAnnotationPresent(LogExecutionTime.class)) {

                    long start = System.nanoTime();

                    method.invoke(service);

                    long end = System.nanoTime();

                    long timeTaken = end - start;

                    System.out.println(
                        "Method: " + method.getName()
                      + " | Execution Time: " + timeTaken + " ns"
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
