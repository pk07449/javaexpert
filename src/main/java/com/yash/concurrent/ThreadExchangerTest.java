package com.yash.concurrent;

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

        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    exchanger.exchange("" + i);
                    System.out.println("producer -> " + i);
                } catch (InterruptedException e) {
                }
            }
        }

        public Producer(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
        }
    }

    static class Consumer implements Runnable {
        private Exchanger<String> exchanger;

        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("consumer -> " + exchanger.exchange(""));
                } catch (InterruptedException e) {
                }
            }
        }

        public Consumer(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
        }
    }

}
