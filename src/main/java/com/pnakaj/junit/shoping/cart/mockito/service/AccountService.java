package com.pnakaj.junit.shoping.cart.mockito.service;

import com.pnakaj.junit.shoping.cart.mockito.domain.Account;

/**
 * Created by pankaj on 1/19/2018.
 */
public interface AccountService {

    Account openAccount(Account account);
    //1. Account No should be start with 0000
    //2. Account no should be  16 digit.
    //3. Initial amount should be 3000
    //4. Add into your bank and also add basic detail into masterData, here master data refer as RBI data.

    boolean addAccount(int destinationAccoNo, String ifcCode, String accountHolderName, String sourceAccountNo);
    //1. destination AccountNo,ifcCode and accountHolderName should be available in master account.
    //2. addAccount into benisifery account.


    boolean transfer(int amount, int sourceAccNo, int destAccNo);
    //1. Source Account no should exist in RBI Mater data.
    //2. Check in source account amount is sufficient to transfer to dstination account.
    //3. when all check pass then deduct amount from accounts.


    Account closeAccount(Account account);
    //1. Delete account from bank and RBI master account.

}
