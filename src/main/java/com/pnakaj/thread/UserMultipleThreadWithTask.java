package com.pnakaj.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
/**
 * Senario :
 */

/**
 * Created by pankaj on 6/18/2017.
 */
public class UserMultipleThreadWithTask {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        List<Future<String>> futures = new ArrayList<>();
        Resource resource = new Resource();
        Future<String> firstResult = executor.submit(() -> resource.task1());
        futures.add(firstResult);
        futures.add(executor.submit(() -> resource.task2(firstResult)));
        futures.add(executor.submit(() -> resource.task3(firstResult)));
        futures.add(executor.submit(() -> resource.task4(firstResult)));
        futures.add(executor.submit(() -> resource.task5(firstResult)));


        executor.shutdown();
    }

    static class Resource {

        public String task1() throws InterruptedException {
            System.out.println("Resource.task1-started");
            System.out.println("Resource.task1");
            Thread.sleep(10000);
            return "task1Completed";
        }


        public String task2(Future<String> future) throws ExecutionException, InterruptedException {
            System.out.println("Resource.task2 -- started");

            while (!future.isDone()) {
                System.out.println("Task1 is not completed yet");
            }

            System.out.println(future.get() + "  Resource.task2 -- Ended");

            return "task2Completed";
        }


        public String task3(Future<String> future) throws ExecutionException, InterruptedException {
            System.out.println("Resource.task3 -- started");

            while (!future.isDone()) {
                System.out.println("Task1 is not completed yet");
            }

            System.out.println(future.get() + "  Resource.task3 -- Ended");
            return "task3Completed";
        }


        public String task4(Future<String> future) throws ExecutionException, InterruptedException {
            System.out.println("Resource.task4 -- started");

            while (!future.isDone()) {
                System.out.println("Task1 is not completed yet");
            }

            System.out.println(future.get() + "  Resource.task4 -- Ended");
            return "task4Completed";
        }

        public String task5(Future<String> future) throws ExecutionException, InterruptedException {
            System.out.println("Resource.task5 -- started");

            while (!future.isDone()) {
                System.out.println("Task1 is not completed yet");
            }

            System.out.println(future.get() + "  Resource.task5 -- Ended");

            return "task5Completed";
        }
    }
}
