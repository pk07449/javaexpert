package com.pnakaj.interviewquestion.coreJava.desing.atm;

/**
 * Created by pankaj on 5/25/2019.
 */
public class ATMMachine {

    private int ReadCard()
    {
        return 123456;
    }

    public boolean verify(int pin)
    {
        return Bank.getBankInstance().verify(ReadCard(), pin);
    }

    public Object selectTransactionType(TransactionType type)
    {
        switch (type)
        {
            case Debit:  return new Debit(ReadCard());
            case Credit: return new Credit(ReadCard());
            default:     return new BalanceCheck(ReadCard());
        }
    }

}
