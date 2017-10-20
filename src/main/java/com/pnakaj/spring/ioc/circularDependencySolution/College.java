package com.pnakaj.spring.ioc.circularDependencySolution;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class College {

    @Autowired
    private School school;

    public College() {
        System.out.println("College.College");
    }

    public School getSchool() {
        return school;
    }
}
