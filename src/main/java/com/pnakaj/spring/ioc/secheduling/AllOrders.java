package com.pnakaj.spring.ioc.secheduling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class AllOrders {

    @Scheduled(fixedRate=2000)
    public void countOrder(){
        System.out.println("Count Student...");
    }
}
