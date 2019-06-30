package com.pnakaj.interviewquestion.coreJava.classLoading.staticblock;

/**
 * Created by pankaj on 6/26/2019.
 */
public class StaticBlockWithStaticVariable {
    public static void main(String[] args) {
        System.out.println(Hai.a);
    }
}

class Hai {
    public static final int a = 10;

    static {
        System.out.println("Hai.static initializer");
    }
}

