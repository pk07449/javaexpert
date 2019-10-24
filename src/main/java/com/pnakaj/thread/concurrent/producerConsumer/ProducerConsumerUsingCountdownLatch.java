package com.pnakaj.thread.concurrent.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

/**
 * Created by pankaj on 7/30/2017.
 */
public class ProducerConsumerUsingCountdownLatch {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(1);
        Queue<Integer> queue = new LinkedList<>();
        new Consumer(countDownLatch, queue).start();
        new Producer(countDownLatch, queue).start();
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

        private final CountDownLatch CountDownLatch;
        private final Queue<Integer> queue;

        @Override
        public void run() {

            IntStream.range(0, 100).forEach(index -> {

                while (queue.size() == 0) {
                    try {
                        System.out.println("Consumer is waiting to be consumed");
                        CountDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                    System.out.println("Consumer consumed for index " + queue.poll());
                    CountDownLatch.countDown();
            });
        }

        public Consumer(CountDownLatch query, Queue<Integer> queue) {
            this.queue = queue;
            this.CountDownLatch = query;
        }
    }

}




