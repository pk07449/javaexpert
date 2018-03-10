package com.pnakaj.thread;

/**
 * Created by pankaj on 3/10/2018.
 */
public class WaitExampleWithSynchronizedBlock {

    public synchronized static void main(String[] args) throws Exception {
        Message message = new Message();
        MessageProcessr messageProcessr = new MessageProcessr();

        new Thread(() -> messageProcessr.m1(message)).start();
        new Thread(() -> messageProcessr.m2(message)).start();
    }
}

class Message {

}

class MessageProcessr {

    public void m1(Message message)  {
        synchronized (message) {
            System.out.println("MessageProcessr.process000000000001");
            try {
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MessageProcessr.process11111111111111");
        }
    }

    public void m2(Message message)  {
        synchronized (message) {
            message.notify();
            System.out.println("MessageProcessr.m2");
        }
    }
}
