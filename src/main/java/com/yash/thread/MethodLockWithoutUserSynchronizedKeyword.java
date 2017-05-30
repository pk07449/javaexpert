package com.yash.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by pankaj on 3/30/2017.
 */
public class MethodLockWithoutUserSynchronizedKeyword {

    public static void main(String[] args) {

        Hello hello = new Hello();
        Thread1 thread1 = new Thread1("t1", hello,"t1");
        Thread1 thread2 = new Thread1("t2", hello,"t1");
        Thread1 thread3 = new Thread1("t3", hello,"t1");
        Thread1 thread4 = new Thread1("t4", hello,"t1");
        Thread1 thread5 = new Thread1("t5", hello,"t1");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    static class Hello {
        private Lock lock = new ReentrantLock();

        void m1(String userName) {

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
        private final String userName;

        public Thread1(String name, Hello resource,String userName) {
            super(name);
            this.resource = resource;
            this.userName = userName;

        }

        public void run() {
            resource.m1(userName);
        }
    }


}
