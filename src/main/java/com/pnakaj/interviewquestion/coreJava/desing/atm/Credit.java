
package com.pnakaj.interviewquestion.coreJava.desing.atm;

/**
 * Created by pankaj on 5/25/2019.
 */
public class Credit {
    private int creditAmount;
    private int accountId;

    public Credit(int id)
    {
        accountId = id;
    }

    public void EnterCreditAmount(int amount)
    {
        // here can be validation of monies
        if (amount <= 0)
            throw new RuntimeException("Amount cannot less than or equal to zero");
        if (amount % 20 != 0)
            throw new RuntimeException("Please enter amount in mulitples of 20");

        creditAmount = amount;
    }

    public int CreditToAccount()
    {
        return Bank.getBankInstance().GetAccountForId(accountId).Credit(creditAmount);
    }

}
