package com.pnakaj.interviewquestion.spring.ioc.inheritance;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/25/2017.
 */

//@Component
//@Scope(proxyMode= ScopedProxyMode.TARGET_CLASS)
public class Hai extends Hello{

    public Hai() {
        System.out.println("Hai.Hai");
    }

}