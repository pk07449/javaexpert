package com.pnakaj.oops.abstrace;


/**
 * Created by pankaj on 4/13/2017.
 */
public class LambdaExecutorImpl extends LambdaExecutor {

    protected void preProcess() {
        System.out.println("LambdaExecutorTemplateImpl.preProcess");
    }

    protected void process() {

        System.out.println("LambdaExecutorTemplateImpl.process");
    }

    public void postProcessor() {
        System.out.println("LambdaExecutorTemplateImpl.postProcessor");

    }
}
