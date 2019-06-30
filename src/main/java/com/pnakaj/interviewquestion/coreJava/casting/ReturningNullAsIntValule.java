package com.pnakaj.interviewquestion.coreJava.casting;

/**
 * Created by pankaj on 6/28/2019.
 */
public class ReturningNullAsIntValule {

    public static void main(String[] args) {
        System.out.println(m1(1));//will throw NullPointerException
        System.out.println(m1(8));//will print 8
    }

    static int m1(int n) {
        return n > 5 ? n : null;
    }

}
