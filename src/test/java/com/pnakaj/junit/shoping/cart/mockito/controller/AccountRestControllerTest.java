package com.pnakaj.junit.shoping.cart.mockito.controller;

import com.pnakaj.junit.shoping.cart.mockito.dto.Account;
import com.pnakaj.junit.shoping.cart.mockito.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/17/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class AccountRestControllerTest {

    @InjectMocks
    private AccountRestController accountRestController;

    @Mock
    private AccountMapper accountMapper;
    @Test
    public void name() throws Exception {
        accountRestController.openAccount(new Account());

    }
}