package com.pnakaj.pattern.gof.behavior.template;


/**
 * Created by pankaj on 4/13/2017.
 */
public class RoleLambda extends LambdaExecutorTemplate<Integer,String> {

    @Override
    protected void preProcess(Integer integer) {
        System.out.println("RoleLambda.preProcess");
    }

    @Override
    protected String process(Integer integer) {
        System.out.println("RoleLambda.process");
        return null;
    }

    @Override
    protected String postProcessor(String s) {
        System.out.println("RoleLambda.postProcessor");
        return null;
    }
}
