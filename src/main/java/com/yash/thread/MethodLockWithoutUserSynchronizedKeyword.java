package com.yash.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by pankaj on 3/30/2017.
 */
public class MethodLockWithoutUserSynchronizedKeyword {

    public static void main(String[] args) {

        Hello hello = new Hello();
        Thread1 thread1 = new Thread1("t1", hello);
        Thread1 thread2 = new Thread1("t2", hello);
        Thread1 thread3 = new Thread1("t3", hello);
        Thread1 thread4 = new Thread1("t4", hello);
        Thread1 thread5 = new Thread1("t5", hello);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    static class Hello {
        private Lock lock = new ReentrantLock();

        void m1() {

            lock.lock();
            String threadName = Thread.currentThread().getName();
            System.out.println();
            System.out.println("Executing by " + threadName);

            for (int i = 0; i < 10; i++) {
                System.out.println(i + "Printed by " + threadName);
            }
            lock.unlock();
        }
    }

    static class Thread1 extends Thread {

        private final Hello resource;

        public Thread1(String name, Hello resource) {
            super(name);
            this.resource = resource;
        }

        public void run() {
            resource.m1();
        }
    }


}
