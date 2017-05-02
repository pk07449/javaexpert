package com.yash.spring.ioc.service;

import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 2/14/2017.
 */

@Service
public class HelloService {

    public HelloService() {
        System.out.println("HelloService Default Constructor");
    }
}
