package com.pnakaj.concurrent;

import java.util.concurrent.Exchanger;

/**
 * Created by pankaj on 5/21/2017.
 */
public class ThreadExchangerTest {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        new Thread(new Producer(exchanger)).start();
        new Thread(new Consumer(exchanger)).start();
    }

    static class Producer implements Runnable {
        private Exchanger<String> exchanger;

        public Producer(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
        }

        public void run() {
            try {
                System.out.println("Producer Send data -> ABCDEF");
                System.out.println("Producer get Data ->" + exchanger.exchange("ABCDEF"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    static class Consumer implements Runnable {
        private Exchanger<String> exchanger;

        public void run() {
            System.out.println("Consumer Send data -> 123456");
            try {
                System.out.println("Consumer get Data ->" + exchanger.exchange("123456"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        public Consumer(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
        }
    }
}

