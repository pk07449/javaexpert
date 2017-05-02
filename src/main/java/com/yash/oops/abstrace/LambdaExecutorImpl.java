package com.yash.oops.abstrace;


/**
 * Created by pankaj on 4/13/2017.
 */
public class LambdaExecutorImpl extends LambdaExecutor {

    protected void preProcess() {
        System.out.println("LambdaExecutorImpl.preProcess");
    }

    protected void process() {

        System.out.println("LambdaExecutorImpl.process");
    }

    void postProcessor() {
        System.out.println("LambdaExecutorImpl.postProcessor");

    }
}
