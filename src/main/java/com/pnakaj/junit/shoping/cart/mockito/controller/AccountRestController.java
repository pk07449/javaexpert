package com.pnakaj.junit.shoping.cart.mockito.controller;

import com.pnakaj.junit.shoping.cart.mockito.domain.Account;
import com.pnakaj.junit.shoping.cart.mockito.mapper.AccountMapper;
import com.pnakaj.junit.shoping.cart.mockito.service.AccountService;
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
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping(name = "/account",method = RequestMethod.POST)
    public com.pnakaj.junit.shoping.cart.mockito.dto.Account openAccount(com.pnakaj.junit.shoping.cart.mockito.domain.Account account){
        return accountMapper.mapToDTO(accountService.openAccount(accountMapper.mapToDomain(account)));
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
