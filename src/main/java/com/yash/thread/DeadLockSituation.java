package com.yash.thread;

import org.omg.SendingContext.RunTime;

/**
 * Created by pankaj on 3/29/2017.
 */
public class DeadLockSituation {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread1().start();
        new Thread2().start();
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1 has acquire lock1 ");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println("Thread 1 has released lock1");

                synchronized (lock2) {
                    System.out.println("Thread 1 has acquire lock2 ");
                    try {
                        Thread.sleep(8000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Thread 1 has released lock2");
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2 has acquire lock1 ");
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println("Thread 2 has released  lock1");

                synchronized (lock1) {
                    System.out.println("Thread 2 has acquire lock2 ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Thread 2 has released lock2");
            }
        }
    }

}


