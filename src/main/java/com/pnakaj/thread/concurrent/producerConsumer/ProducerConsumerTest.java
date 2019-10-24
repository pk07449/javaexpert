package com.pnakaj.thread.concurrent.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * Created by pankaj on 7/30/2017.
 */
public class ProducerConsumerTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        new Producer(linkedList).start();
        new Consumer(linkedList).start();
    }
}

class Producer extends Thread {
    private Queue queue;

    public Producer(LinkedList linkedList) {
        this.queue = linkedList;
    }

    @Override
    public void run() {
        IntStream.range(0, 10).forEach(index -> {
            synchronized (queue) {
                while (queue.size() >= 1) {
                    System.out.println("Producer is waiting to be produced");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.add(index);
                System.out.println("Producer produced for index " + index);
                queue.notify();
            }
        });
    }
}


class Consumer extends Thread {
    private Queue queue;

    public Consumer(LinkedList linkedList) {
        this.queue = linkedList;
    }

    @Override
    public void run() {
        IntStream.range(0, 10).forEach(index -> {
            synchronized (queue) {
                while (queue.size() == 0) {
                    try {
                        System.out.println("Consumer is waiting to be consumed");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("Consumer consumed for index " + queue.poll());
                queue.notify();

            }
        });
    }
}

