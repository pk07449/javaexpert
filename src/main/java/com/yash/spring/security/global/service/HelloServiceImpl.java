package com.yash.spring.security.global.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 2/14/2017.
 */

@Service
public class HelloServiceImpl implements HelloService {


    public HelloServiceImpl() {
        System.out.println("HelloServiceImpl Default Constructor");
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    public String requiresUserRole() {
        System.out.println("requiresUserRole");
        return "ha ha ha";
    }
}
