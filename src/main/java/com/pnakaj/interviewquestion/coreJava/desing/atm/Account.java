package com.pnakaj.interviewquestion.coreJava.desing.atm;

/**
 * Created by pankaj on 5/25/2019.
 */
public class Account {
    private int accoutNumber;
    private int pin;

    private double balance;

    public int getPin()
    {
        return pin;
    }

    public void UpdatePin(int p)
    {
        pin = p;
    }

    public double GetBalance()
    {
        return balance;
    }

    public void Debit(double amount)
    {
        balance += amount;
    }

    public int Credit(int amount)
    {
        if (amount < balance)
        {
            balance -= amount;
            return amount;
        }
        else {
            throw new RuntimeException("Not enough balance");
        }

    }
}
