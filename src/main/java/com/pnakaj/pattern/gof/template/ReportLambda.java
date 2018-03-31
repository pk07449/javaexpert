package com.pnakaj.pattern.gof.template;


/**
 * Created by pankaj on 4/13/2017.
 */
public class ReportLambda extends LambdaExecutorTemplate<Integer,String> {

    @Override
    protected void preProcess(Integer integer) {
        System.out.println("ReportLambda.preProcess");
    }

    @Override
    protected String process(Integer integer) {
        System.out.println("ReportLambda.process");
        return null;
    }

    @Override
    protected String postProcessor(String s) {
        System.out.println("ReportLambda.postProcessor");
        return null;
    }
}
