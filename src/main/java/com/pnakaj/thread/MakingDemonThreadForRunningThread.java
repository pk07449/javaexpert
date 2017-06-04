package com.pnakaj.thread;

/**
 * Created by pankaj on 6/4/2017.
 */
public class MakingDemonThreadForRunningThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread.setDaemon(true);

        //RuntimeException IllegalThreadStateException


    }
}
