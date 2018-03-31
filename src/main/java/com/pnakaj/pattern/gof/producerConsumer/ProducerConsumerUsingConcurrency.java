package com.pnakaj.pattern.gof.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by pankaj on 7/30/2017.
 */
public class ProducerConsumerUsingConcurrency {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Consumer(countDownLatch,queue));
        executorService.submit(new Consumer(countDownLatch,queue));
        Future submit = executorService.submit(new Producer(countDownLatch,queue));
        try {
            Object o = submit.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    static class Producer extends Thread {

        private final CountDownLatch countDownLatch;
        private final Queue<Integer> queue;

        @Override
        public void run() {

            IntStream.range(0, 100).forEach(index -> {
                while (queue.size() >= 1) {

                    System.out.println("Producer is waiting to be produced");
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                queue.add(index);
                System.out.println("Producer produced for index " + index);
                countDownLatch.countDown();

            });

        }

        public Producer(CountDownLatch countDownLatch, Queue<Integer> queue) {
            this.countDownLatch = countDownLatch;
            this.queue = queue;
        }
    }

    static class Consumer extends Thread {

        private final CountDownLatch countDownLatch;
        private final Queue<Integer> queue;

        @Override
        public void run() {

            IntStream.range(0, 100).forEach(index -> {

                while (queue.size() == 0) {
                    try {
                        System.out.println("Consumer is waiting to be consumed");
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                System.out.println("Consumer consumed for index " + queue.poll());
                countDownLatch.countDown();
            });
        }

        public Consumer(CountDownLatch query, Queue<Integer> queue) {
            this.queue = queue;
            this.countDownLatch = query;
        }
    }

}




