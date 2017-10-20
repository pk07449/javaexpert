package com.pnakaj.oops.abstrace;

/**
 * Created by pankaj on 4/13/2017.
 */
public abstract class LambdaExecutor {


    final public void executeLambda() {
        preProcess();
        process();
        postProcessor();
    }

    protected abstract void preProcess();
    protected abstract void process();
    protected abstract void postProcessor();

}
