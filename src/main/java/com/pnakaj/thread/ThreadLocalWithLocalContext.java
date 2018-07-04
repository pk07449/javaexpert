package com.pnakaj.thread;

/**
 * Created by pankaj on 6/16/2017.
 */
public class ThreadLocalWithLocalContext {

    public static void main(String[] args) {
        new MyThread(new SomeClass(1,"A")).start();
        new MyThread(new SomeClass(2,"B")).start();
        new MyThread(new SomeClass(3,"C")).start();
        new MyThread(new SomeClass(4,"D")).start();
        new MyThread(new SomeClass(5,"E")).start();
        new MyThread(new SomeClass(6,"F")).start();
        new MyThread(new SomeClass(7,"G")).start();
        new MyThread(new SomeClass(8,"H")).start();
        new MyThread(new SomeClass(9,"I")).start();
        new MyThread(new SomeClass(10,"J")).start();
    }

    static  class MyThread extends  Thread {

        private SomeClass someClass;
        public MyThread(SomeClass someClass) {
            this.someClass = someClass;
        }

        public void run() {
            m1(someClass);
            m2();
            m3();
            m4();
            m5();
        }
    }

    static class ThreadContext {
        static ThreadLocal<SomeClass> threadLocal = new ThreadLocal<SomeClass>();

        static SomeClass get() {
            return threadLocal.get();
        }

        static void set(SomeClass someClass) {
            threadLocal.set(someClass);
        }
    }

    private static void m5() {
        System.out.println(Thread.currentThread().getName() + "  m5() ->  "+ThreadContext.get());
    }

    private static void m4() {
        System.out.println(Thread.currentThread().getName() + "  m4() ->  "+ThreadContext.get());
    }

    private static void m3() {
        System.out.println(Thread.currentThread().getName() + "  m3() ->  "+ThreadContext.get());
    }

    private static void m2() {
        System.out.println(Thread.currentThread().getName() + "  m2() ->  "+ThreadContext.get());
    }

    private static void m1(SomeClass someClass) {
        ThreadContext.set(someClass);
        System.out.println(Thread.currentThread().getName() + "  m1() ->  "+ThreadContext.get());
    }
}
