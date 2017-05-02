package com.yash.spring.security.global.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 2/14/2017.
 */

@Service
public class HelloService {


    public HelloService() {
        System.out.println("HelloService Default Constructor");
    }

        @PreAuthorize("hasRole('ROLE_USER')")
    public String requiresUserRole() {
        System.out.println("requiresUserRole");
        return "ha ha ha";
    }
}
