package com.pnakaj.spring.ioc.circularDependencySolution;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class School {
    @Autowired
    private College college;

    public College getCollege() {
        return college;
    }
}
