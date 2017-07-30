package com.pnakaj.pattern.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by pankaj on 7/30/2017.
 */
public class ProducerConsumerUsingConcurrency {

    public static void main(String[] args) {
        ArrayBlockingQueue linkedList = new ArrayBlockingQueue(100);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Consumer(linkedList,"consumer1"));
        executorService.submit(new Consumer(linkedList,"consumer2"));
        executorService.submit(new Consumer(linkedList,"consumer3"));
        executorService.submit(new Consumer(linkedList,"consumer4"));
        executorService.submit(new Consumer(linkedList,"consumer5"));
        Future submit = executorService.submit(new Producer(linkedList));
        try {
            Object o = submit.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

    static class Producer implements Runnable {

        private final ArrayBlockingQueue queue;

        @Override
        public void run() {

            IntStream.range(0, 100).forEach(index -> {

                try {
                    queue.put(index);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Producer produced for index " + index);
            });

        }

        public Producer(ArrayBlockingQueue query) {
            this.queue = query;
        }
    }

    static class Consumer implements Runnable {

        private final ArrayBlockingQueue queue;

        @Override
        public void run() {

            IntStream.range(0, 20).forEach(index -> {
                System.out.println("Consumer "+!queue.isEmpty());
                while (!queue.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " Consumed " + queue.poll());
                }
            });

        }

        public Consumer(ArrayBlockingQueue query, String name) {
            this.queue = query;
            Thread.currentThread().setName(name);
        }
    }

}




