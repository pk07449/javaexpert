package com.pnakaj.thread;

/**
 * Created by pankaj on 3/29/2017.
 */
public class ThreadLocalTest {

    public static void main(String[] args) {

        CustomThreadLocal customThreadLocal = new CustomThreadLocal();

        Thread t1= new Thread(customThreadLocal);
        Thread t2= new Thread(customThreadLocal);
        Thread t3= new Thread(customThreadLocal);
        Thread t4= new Thread(customThreadLocal);
        Thread t5= new Thread(customThreadLocal);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

   static class CustomThreadLocal implements Runnable {

        static int counter;

        ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();


       public void run() {

           if(null != threadLocal.get() && threadLocal.get() == 1) {
               threadLocal.set(threadLocal.get().intValue()+1);
           } else {
               counter ++;
               threadLocal.set(1);
           }



           System.out.println("ThreadLocal Value " + threadLocal.get());
           System.out.println("Counter Value " + counter);
       }
   }
}
