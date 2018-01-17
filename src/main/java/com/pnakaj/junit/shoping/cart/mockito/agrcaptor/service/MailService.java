package com.pnakaj.junit.shoping.cart.mockito.agrcaptor.service;

import com.pnakaj.junit.shoping.cart.mockito.agrcaptor.domain.Email;
import com.pnakaj.junit.shoping.cart.mockito.agrcaptor.externalService.ExternalMailerService;

/**
 * Created by pankaj on 1/17/2018.
 */
public class MailService {

    private ExternalMailerService externalMailerService;

    public void deliver(String address, String body) {
        Email email = new Email();
        email.setBody(body);
        applyUserAndDomainUsingProvidedAddress(address, email);
        externalMailerService.send(email);

//        String[] addressComponents = address.split("@");
//        externalMailerService.send( addressComponents[1], addressComponents[0], body);

    }

    private void applyUserAndDomainUsingProvidedAddress(String address, Email email) {
        //TODO - refactor this into the Email class (constructor? smart accessor?)
        String[] addressComponents = address.split("@");
        email.setUser(addressComponents[0]);
        email.setDomain(addressComponents[1]);
    }
}
