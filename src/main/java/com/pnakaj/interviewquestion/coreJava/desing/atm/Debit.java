package com.pnakaj.interviewquestion.coreJava.desing.atm;

/**
 * Created by pankaj on 5/25/2019.
 */
public class Debit {
    private double debitAmount;
    private int accountId;

    public Debit(int id)
    {
        accountId = id;
    }

    public void InsertDebitAmount(double amount)
    {
        // here can be validation of monies
        if (amount <= 0)
            throw new RuntimeException("Amount cannot less than or equal to zero");
        debitAmount = amount;
    }

    public void DebitToAccount()
    {
        Bank.getBankInstance().GetAccountForId(accountId).Debit(debitAmount);
    }

}
