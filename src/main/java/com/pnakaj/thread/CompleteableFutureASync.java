package com.pnakaj.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by pankaj on 6/20/2017.
 */
public class CompleteableFutureASync {


    public static void main(String[] args) {

        Resource resource = new Resource();

        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> resource.task1())
                .thenApplyAsync(result1 -> resource.task2(result1))
                .thenApplyAsync(result2 -> resource.task3(result2))
                .thenApplyAsync(result3 -> resource.task4(result3))
                .thenApplyAsync(result4 -> resource.task5(result4));


        try {
            stringCompletableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

    static class Resource {

        public String task1() {
            System.out.println("Resource.task1-started");
            System.out.println("Resource.task1");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Resource.task1-ended");
            return "task1Completed";
        }


        public String task2(String future) {
            System.out.println("Resource.task2 -- started");
            System.out.println(future + "  Resource.task2 -- Ended");
            return "task2Completed";
        }


        public String task3(String future) {
            System.out.println("Resource.task3 -- started");


            System.out.println(future + "  Resource.task3 -- Ended");
            return "task3Completed";
        }


        public String task4(String future) {
            System.out.println("Resource.task4 -- started");

            System.out.println(future + "  Resource.task4 -- Ended");
            return "task4Completed";
        }

        public String task5(String future) {
            System.out.println("Resource.task5 -- started");


            System.out.println(future + "  Resource.task5 -- Ended");
            return "task5Completed";
        }
    }
}
