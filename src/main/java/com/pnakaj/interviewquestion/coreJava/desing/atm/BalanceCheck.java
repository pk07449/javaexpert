package com.pnakaj.interviewquestion.coreJava.desing.atm;

/**
 * Created by pankaj on 5/25/2019.
 */
public class BalanceCheck {

    private int accountId;

    public BalanceCheck(int id)
    {
        accountId = id;
    }

    public double CheckBalance()
    {
        return Bank.getBankInstance().GetAccountForId(accountId).GetBalance();
    }
}
