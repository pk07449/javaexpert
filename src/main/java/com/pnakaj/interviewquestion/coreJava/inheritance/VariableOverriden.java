package com.pnakaj.interviewquestion.coreJava.inheritance;

/**
 * Created by pankaj on 5/25/2019.
 */
public class VariableOverriden {

    static class Hello {
        int a = 10;
    }
    static class  Hai extends  Hello{
        int a = 20;
    }
    public static void main(String[] args) {
        Hello hello = new Hai();
        System.out.println(hello.a);// output 10
        Hai hai = (Hai) hello;
        System.out.println(hai.a);// output 20
    }
}
