package com.pnakaj.junit.shoping.cart.mockito.agrcaptor.externalService;

import com.pnakaj.junit.shoping.cart.mockito.agrcaptor.domain.Email;

/**
 * Created by pankaj on 1/17/2018.
 */
public interface ExternalMailerService {
    public void send(String domain, String user, String body);
    public void send(Email email);
}
