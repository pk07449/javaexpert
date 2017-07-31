package com.pnakaj.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pankaj on 7/31/2017.
 */
public class HashCodeContract {

    public static void main(String[] args) {
        HashMap<Customer, Integer> customerIntegerHashMap = new HashMap<>();
        customerIntegerHashMap.put(new Customer(1, "A"), 1);
        customerIntegerHashMap.put(new Customer(1,"A"),2);
    }
}

class Customer {
    private int id;
    private String name;

    @Override
    public int hashCode() {

        int result = 31  + name.hashCode();
        System.out.println("Customer.hashCode");
        return result;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Customer.equals "+ eq(o));
        return eq(o);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private boolean eq(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        return name.equals(customer.name);
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


