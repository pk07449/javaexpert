package com.pnakaj.collection;

import com.pnakaj.spring.ioc.order.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by pankaj on 3/19/2018.
 */
public class SortingForMultipleField {

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
        new Customer(1,"Z","50"),
        new Customer(1,"A","5050"),
        new Customer(1,"A","10"),
        new Customer(11,"X","20"),
        new Customer(1,"C","20")
        );

        Comparator<Customer> c = comparing(Customer::getId)
                .thenComparing(Customer::getName)
                .thenComparing(Customer::getAge);
        customers.sort(c);

        System.out.println(customers);

    }

    private static class Customer{
        int id;
        String name;
        String age;

        public Customer(int id, String name, String age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        @Override
        public String
        toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}


