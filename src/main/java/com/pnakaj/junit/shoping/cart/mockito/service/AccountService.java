package com.pnakaj.junit.shoping.cart.mockito.service;

import com.pnakaj.junit.shoping.cart.mockito.exception.BadRequest;
import com.pnakaj.junit.shoping.cart.mockito.exception.InvalidAccount;
import com.pnakaj.junit.shoping.cart.mockito.domain.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by pankaj on 1/16/2018.
 */
public class AccountService {

    List<Account> masterData = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();
    List<Account> accountBenificery = new ArrayList<>();

    public com.pnakaj.junit.shoping.cart.mockito.domain.Account openAccount(com.pnakaj.junit.shoping.cart.mockito.domain.Account account) {
        String accountNumber = "" + account.getNumber();

        if (!accountNumber.startsWith("0000")) {
            throw new InvalidAccount();
        }

        if (!(accountNumber.length() == 16)) {
            throw new InvalidAccount();
        }

        if (!(account.getAmount() >= 3000)) {
            throw new InvalidAccount();
        }

        accounts.add(account);
        masterData.add(account);
        return account;


        //1. Account No should be start with 0000
        //2. Account no should be  16 digit.
        //3. Initial amount should be 3000
        //4. Add into your bank and also add basic detail into masterData, here master data refer as RBI data.

    }

    public boolean addAccount(int destinationAccoNo, String ifcCode, String accountHolderName, String sourceAccountNo) {
        //1. destination AccountNo,ifcCode and accountHolderName should be available in master account.
        //2. addAccount into benisifery account.

        if(masterData.stream().anyMatch(account -> account.getNumber() == destinationAccoNo
                && account.getIfcCode().equals(ifcCode)
                && account.getName().equals(accountHolderName))){

            Account e = new Account();
            e.setName(accountHolderName);
            e.setIfcCode("SBI");
            e.setNumber(destinationAccoNo);
            return accountBenificery.add(e);
        }
        return false;
    }


    public boolean transfer(int amount, int sourceAccNo, int destAccNo) {

        if(!masterData.stream().anyMatch(account -> account.getNumber() == destAccNo)){
            throw new InvalidAccount();
        };

        if(!accounts.stream().anyMatch(account -> account.getNumber()== sourceAccNo && account.getAmount() > amount)){
            throw new BadRequest();
        };

        Account account1 = accounts.stream().filter(account -> account.getNumber() == sourceAccNo).findFirst().get();
        account1.setAmount(account1.getAmount()-amount);
        return true;
    }

    public Account closeAccount(Account account) {
        return null;
    }


}
