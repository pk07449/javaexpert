package com.pnakaj.junit.shoping.cart.mockito.controller;

import com.pnakaj.junit.shoping.cart.mockito.domain.Account;
import com.pnakaj.junit.shoping.cart.mockito.mapper.AccountMapper;
import com.pnakaj.junit.shoping.cart.mockito.service.AccountService;
import com.pnakaj.junit.shoping.cart.mockito.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pankaj on 1/16/2018.
 */

@RestController
@RequestMapping(name = "/accounts")
public class AccountRestController {

    @Autowired
    private AccountService accountServiceImpl;
    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping(name = "/account",method = RequestMethod.POST)
    public com.pnakaj.junit.shoping.cart.mockito.dto.Account openAccount(com.pnakaj.junit.shoping.cart.mockito.dto.Account account){

        Account domainAccount = accountMapper.mapToDomain(account);

        Account openedDomainAccount = accountServiceImpl.openAccount(domainAccount);

        com.pnakaj.junit.shoping.cart.mockito.dto.Account dtoAcocunt = accountMapper.mapToDTO(openedDomainAccount);

        return dtoAcocunt;
    }

    @RequestMapping(name = "/transfer",method = RequestMethod.POST)
    public boolean transfer(int amount,int sourceAccNo, int destAccNo) {
        return false;
    }

    @RequestMapping(name = "/add/thirdParty",method = RequestMethod.POST)
    public boolean addAccount(int destinationAccoNo, String ifcCode,String accountHolderName, String sourceAccountNo){
        return false;
    }

    @RequestMapping(name = "/{accountNo}/balance",method = RequestMethod.GET)
    public  int getCurrentAccountBalance(){
        return 0;
    }

    @RequestMapping(name = "/{accountNo}/miniStatement",method = RequestMethod.GET)
    public List<String> getMiniStatement(int accNo){
        return null;
    }

    @RequestMapping(name = "/account/{accountNo}",method = RequestMethod.DELETE)
    public Account closeAccount(Account account){
        return null;
    }

}
