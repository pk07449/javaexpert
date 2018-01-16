package com.pnakaj.junit.shoping.cart.mockito.service;

import com.pnakaj.junit.shoping.cart.mockito.domain.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 1/16/2018.
 */
public class AccountService {

    List<Account> masterData = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();

    public com.pnakaj.junit.shoping.cart.mockito.domain.Account openAccount(com.pnakaj.junit.shoping.cart.mockito.domain.Account account){
        //1. Account No should be start with 0000
        //2. Account no should be  16 digit.
        //3. Initial amount should be 3000
        //4. Add into your bank and also add basic detail into masterData, here master data refer as RBI data.

        accounts.add(account);
        masterData.add(account);
        return  account;
    }

    public boolean transfer(int amount,int sourceAccNo, int destAccNo) {
        //1. verify destAccNo with master data.
        //2. check current balance
        //3. then deduct from current balance
        return false;
    }

    public boolean addAccount(int destinationAccoNo, String ifcCode,String accountHolderName, String sourceAccountNo){
        return false;
    }

    public  int getCurrentAccountBalance(){
        return 0;
    }

    public List<String> getMiniStatement(int accNo){
        return null;
    }

    public Account closeAccount(Account account){
        return null;
    }
}
