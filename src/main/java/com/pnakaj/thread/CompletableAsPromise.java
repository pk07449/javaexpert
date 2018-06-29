package com.pnakaj.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/**
 * Created by pankaj on 6/20/2017.
 */
public class CompletableAsPromise {


    public static void main(String[] args) {

        Resource resource = new Resource();

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> resource.task1());
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> resource.task2());
        CompletableFuture<Void> stringCompletableFuture = CompletableFuture.allOf(task1, task2);

        try {
            while (!stringCompletableFuture.isDone())
                System.out.println(stringCompletableFuture.get());
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
                Thread.sleep(80000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Resource.task1-ended");
            return "task1Completed";
        }

        public String task2() {
            System.out.println("Resource.task2-started");
            System.out.println("Resource.task2");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Resource.task2-ended");
            return "task2Completed";
        }


    }
}
