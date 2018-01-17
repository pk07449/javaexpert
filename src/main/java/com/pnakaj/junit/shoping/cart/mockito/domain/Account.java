package com.pnakaj.junit.shoping.cart.mockito.domain;

import java.util.Date;

/**
 * Created by pankaj on 1/16/2018.
 */
public class Account {

    private int id;
    private long number;
    private int amount;
    private String name;
    private String ifcCode;
    private Date createTime;

    public Account(){}
    public Account(int id, long number, int amount, String name, String ifcCode) {
        this.id = id;
        this.number = number;
        this.amount = amount;
        this.name = name;
        this.ifcCode = ifcCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIfcCode() {
        return ifcCode;
    }

    public void setIfcCode(String ifcCode) {
        this.ifcCode = ifcCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        if (number != account.number) return false;
        if (amount != account.amount) return false;
        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (ifcCode != null ? !ifcCode.equals(account.ifcCode) : account.ifcCode != null) return false;
        return createTime != null ? createTime.equals(account.createTime) : account.createTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) (number ^ (number >>> 32));
        result = 31 * result + amount;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ifcCode != null ? ifcCode.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
