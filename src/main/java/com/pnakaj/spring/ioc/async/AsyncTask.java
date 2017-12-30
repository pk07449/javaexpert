package com.pnakaj.spring.ioc.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class AsyncTask {

    @Async
    public void asyncTask() throws InterruptedException {
        System.out.println("Count Student...start");

        Thread.sleep(60000);

        System.out.println("Count Student...end");
    }

    public void m1() throws InterruptedException {
        System.out.println("M1...start");

        Thread.sleep(60000);

        System.out.println("M1...end");
    }
}
