package com.pnakaj.spring.ioc.factory.instancefactory;

/**
 * Created by pankaj on 10/25/2017.
 */

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}