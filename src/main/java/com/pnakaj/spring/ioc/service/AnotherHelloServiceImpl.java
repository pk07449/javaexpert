package com.pnakaj.spring.ioc.service;

import com.pnakaj.spring.security.global.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 2/14/2017.
 */

@Service
public class AnotherHelloServiceImpl implements HelloService {

    public AnotherHelloServiceImpl() {
        System.out.println("AnotherHelloServiceImpl Default Constructor");
    }

    @Override
    public String toString() {
        return "AnotherHelloServiceImpl";
    }
}
