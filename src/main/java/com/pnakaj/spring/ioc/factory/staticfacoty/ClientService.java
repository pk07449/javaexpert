package com.pnakaj.spring.ioc.factory.staticfacoty;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/25/2017.
 */

public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
        System.out.println("ClientService.ClientService");
    }

    public static ClientService createInstance() {
        System.out.println("ClientService.createInstance");
        return clientService;
    }
}