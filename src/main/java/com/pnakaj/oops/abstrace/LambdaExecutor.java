package com.pnakaj.oops.abstrace;

/**
 * Created by pankaj on 4/13/2017.
 */
public abstract class LambdaExecutor {
    protected abstract void preProcess();

    final public void executeLambda() {
        preProcess();
        process();
        postProcessor();
    }

    protected abstract void process();

    abstract void postProcessor();

}
