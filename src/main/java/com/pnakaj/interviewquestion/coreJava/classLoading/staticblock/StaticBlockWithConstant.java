package com.pnakaj.interviewquestion.coreJava.classLoading.staticblock;

/**
 * Created by pankaj on 6/26/2019.
 */
public class StaticBlockWithConstant {
    public static void main(String[] args) {
        System.out.println(Hello.a);
    }
}

class Hello {
    public static final int a = 10;

    static {
        System.out.println("StaticBlockWithConstant.static initializer");
    }
}
