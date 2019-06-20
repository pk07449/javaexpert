package com.pnakaj.interviewquestion.coreJava.exception.tryFinallyBlockReturnType;

/**
 * Created by pankaj on 6/20/2019.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(tryBlockReturnTypeOverrideWithFinallyBlockReturnType());
        System.out.println(tryBlockExceptionWithFinallyBlockReturnType());
        System.out.println("Hi I am try block, i am safe even i am throwing exception");
        System.out.println(tryBlockAndCatchBlockExceptionWithFinallyBlockReturnType());
        System.out.println("Hi I am try and catch block, i am safe even i am throwing exception");
    }

    static  int tryBlockReturnTypeOverrideWithFinallyBlockReturnType(){
        try {
            return 1;
        }catch(Exception e) {
            return 2;
        }finally {
             return 3;
        }
    }

    static  int tryBlockExceptionWithFinallyBlockReturnType(){
        try {
            throw new  NullPointerException();
        }finally {
            return 3;
        }
    }

    static  int tryBlockAndCatchBlockExceptionWithFinallyBlockReturnType(){
        try {
            throw new  NullPointerException();
        }catch (Exception e) {
            throw new  NullPointerException();
        }
        finally {
            return 3;
        }
    }


}




