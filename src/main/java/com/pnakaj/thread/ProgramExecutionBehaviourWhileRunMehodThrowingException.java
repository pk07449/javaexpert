package com.pnakaj.thread;

/**
 * Created by pankaj on 6/4/2017.
 */
public class ProgramExecutionBehaviourWhileRunMehodThrowingException {
// Question :what will happen when thread is throwing any exception then program execution will stop or continuee;
// Ans : Coninuee
    public static void main(String[] args) {
        new Thread(() -> {
                throw new RuntimeException("Hahahahahaha");
        }).start();

        System.out.println("kumar");

    }
}
