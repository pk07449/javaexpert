package com.pnakaj.pattern.gof.template;

/**
 * Created by pankaj on 4/13/2017.
 */
public abstract class LambdaExecutorTemplate<T, R> {


    final public R handleRequest(T t) {
        preProcess(t);
        return postProcessor(process(t));
    }

    protected abstract void preProcess(T t);

    protected abstract R process(T t);

    protected abstract R postProcessor(R r);

}
