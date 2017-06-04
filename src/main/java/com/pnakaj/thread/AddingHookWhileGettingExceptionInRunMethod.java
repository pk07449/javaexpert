package com.pnakaj.thread;

import java.io.IOException;

/**
 * Created by pankaj on 6/4/2017.
 */
public class AddingHookWhileGettingExceptionInRunMethod {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                throw new RuntimeException("should show this method");
            }
        });
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Exception occured");
            }
        } );
        thread.start();
    }
}