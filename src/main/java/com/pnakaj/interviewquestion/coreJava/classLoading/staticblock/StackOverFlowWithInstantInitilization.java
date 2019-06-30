package com.pnakaj.interviewquestion.coreJava.classLoading.staticblock;

/**
 * Created by pankaj on 6/26/2019.
 */
public class StackOverFlowWithInstantInitilization {

    static StackOverFlowWithInstantInitilization stackOverFlowWithInstantInitilization = new StackOverFlowWithInstantInitilization();

    public static void main(String[] args) {
         new StackOverFlowWithInstantInitilization();
    }
}
