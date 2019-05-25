package com.pnakaj.interviewquestion.spring.ioc.inheritance;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/25/2017.
 */

//@Component
//@Scope(proxyMode= ScopedProxyMode.TARGET_CLASS)
public class Hello {
    public Hello() {
        System.out.println("Hello.Hello");
    }
}