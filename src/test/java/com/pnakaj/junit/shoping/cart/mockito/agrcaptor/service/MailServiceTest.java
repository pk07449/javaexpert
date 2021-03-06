package com.pnakaj.junit.shoping.cart.mockito.agrcaptor.service;
import com.pnakaj.junit.shoping.cart.mockito.agrcaptor.domain.Email;
import com.pnakaj.junit.shoping.cart.mockito.agrcaptor.externalService.ExternalMailerService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

/**
 * Created by pankaj on 1/17/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class MailServiceTest {

    @InjectMocks
    private MailService mailService;

    @Mock
    private ExternalMailerService externalMailSystem;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    public void sendsEmailByConstructingEmailObject() {
        String expectedUser = "pankaj";
        String expectedDomain = "yash.com";
        String expectedBody = "Hi Pankaj!";

        mailService.deliver(expectedUser + "@" + expectedDomain, expectedBody);

        verify(externalMailSystem).send(emailCaptor.capture());
        Email email = emailCaptor.getValue();
        assertThat(email.getUser(), is(expectedUser));
        assertThat(email.getDomain(), is(expectedDomain));
        assertThat(email.getBody(), is(expectedBody));
    }

    @Test
    @Ignore
    public void sendsEmailBySplittingAddress() {
        mailService.deliver("pankaj@yash.com", "Hi Pankaj!");
        verify(externalMailSystem).send("yash.com", "pankaj", "Hi Pankaj!");
    }

}