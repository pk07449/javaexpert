package com.pnakaj.jdk8.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * Created by pankaj on 2/24/2019.
 */
public class SupplierTestAfterRefactoring {
    enum Country {
        IN,US,UK
    }

    @FunctionalInterface
    interface CustomSupplier<T,R> {
        R get(T country);
    }

    public static void main(String[] args) {
        Map<Country,CustomSupplier<Country,String>> map = new HashMap<>();
        map.put(Country.US,(countryName)-> countryName.name() + " Dollar");
        map.put(Country.IN,(countryName)-> countryName.name() + " Rupee");
        map.put(Country.UK,(countryName)-> countryName.name() + " Pound");
        System.out.println(map.get(Country.IN).get(Country.IN));
    }
}
