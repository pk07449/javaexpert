package com.pnakaj.spring.ioc.dependson;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by pankaj on 10/26/2017.
 */
@Repository
public class CustomerRepo {

    public CustomerRepo() {
        System.out.println("CustomerRepo.CustomerRepo");
    }
}
