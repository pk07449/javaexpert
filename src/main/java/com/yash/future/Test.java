package com.yash.future;

import java.util.concurrent.*;

/**
 * Created by pankaj on 1/30/2017.
 */
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new Callable<String>() {
            public String call() throws Exception {
                String data = "";
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(5000);
                    data += i;
                }
                return data;
            }
        });

        while (!future.isDone()) {
            System.out.println("Task is not completed yet....");
            Thread.sleep(1); //sleep for 1 millisecond before checking again }
        }

        System.out.print(future.get());
    }}
