package com.pnakaj.junit.shoping.cart.mockito.service;

import com.pnakaj.junit.shoping.cart.mockito.domain.Account;
import com.pnakaj.junit.shoping.cart.mockito.utils.Clock;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/18/2018.
 */
public class AccountServiceImplTest {

    AccountServiceImpl accountServiceImpl = new AccountServiceImpl();

    @Test
    public void opneAccountInBankWithValidInformation() {
        Clock.freeze(10);
        Account actualAcocunt = accountServiceImpl.openAccount(buildAccount());

        Account expectedAccount = buildAccount();
        expectedAccount.setCreateTime(Clock.now());

        assertEquals(expectedAccount.getCreateTime(), actualAcocunt.getCreateTime());
        Clock.reset();
    }

    private Account buildAccount() {
        return new Account(1,100001111,5000,"pankaj","IDBI0001");
    }
}