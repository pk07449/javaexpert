package com.pnakaj.interviewquestion.coreJava.classLoading.staticblock;

/**
 * Created by pankaj on 6/26/2019.
 */
public class StackOverFlowWithStaticInitilization {

    static StackOverFlowWithStaticInitilization stackOverFlowWithInstantInitilization = new StackOverFlowWithStaticInitilization();

    public static void main(String[] args) {
         new StackOverFlowWithStaticInitilization();
    }
}
