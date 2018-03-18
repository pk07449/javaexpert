package com.pnakaj.collection;

import com.pnakaj.spring.ioc.order.*;
import com.pnakaj.spring.ioc.order.Customer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pankaj on 3/19/2018.
 */
public class FindDuplicateFromList {

    public static void main(String[] args) {

        List<Customer> list = Arrays.asList(
                new Customer(1,"pankaj"),
                new Customer(1,"kumar"),
                new Customer(1,"pankaj"));

        List<Customer> customers = list.stream().distinct()
                .filter(entry -> Collections.frequency(list, entry) > 1).collect(Collectors.toList());

        System.out.println(customers);
    }

   static class Customer {
        int id;
        String name;

       public Customer(int id, String name) {
           this.id = id;
           this.name = name;
       }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;

           Customer customer = (Customer) o;

           if (id != customer.id) return false;
           return name.equals(customer.name);
       }

       @Override
       public int hashCode() {
           int result = id;
           result = 31 * result + name.hashCode();
           return result;
       }

       @Override
       public String toString() {
           return "Customer{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   '}';
       }
   }
}
