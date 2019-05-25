package com.pnakaj.interviewquestion.coreJava.desing.atm;

import java.util.Hashtable;

/**
 * Created by pankaj on 5/25/2019.
 */
public class Bank {
    private static Bank _instance;
    Hashtable<Integer, Account> accountMap;
    private Bank()
    {
        accountMap = new Hashtable<>();
    }

    public static Bank getBankInstance()
    {
        if (_instance == null)
            _instance = new Bank();
        return _instance;
    }

    public void AddAccount(Account account, int id)
    {
        accountMap.put(id, account);
    }
    public boolean verify(int id, int pin)
    {
        if (accountMap.containsKey(id))
        {
            return accountMap.get(id).getPin() == pin;
        }
        return false;
    }

    public Account GetAccountForId(int id)
    {
        return accountMap.get(id);
    }
}
