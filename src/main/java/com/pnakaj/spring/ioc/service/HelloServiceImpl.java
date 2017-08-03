package com.pnakaj.spring.ioc.service;

import com.pnakaj.spring.security.global.service.HelloService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 2/14/2017.
 */

@Service
@Primary
public class HelloServiceImpl  implements HelloService{
    public HelloServiceImpl() {
        System.out.println("HelloServiceImpl Default Constructor");
    }

    @Override
    public String toString() {
        return "HelloServiceImpl";
    }
}
