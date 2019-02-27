package com.pnakaj.jdk8.function;

/**
 * Created by pankaj on 2/24/2019.
 */
public class SupplierTestBeforeRefactoring {

    public static void main(String[] args) {

        System.out.println(findCountryCurrency(Country.IN));
    }

    private static String findCountryCurrency(Country country) {
        if (country.equals("IN")) {
            return country.IN.name() + "rupees";

        } else if (country.US.equals("US")) {
            return country.US.name() + "rupees";

        } else if (country.US.equals("UK")) {
            return country.UK.name() + "rupees";
        } else {
            return "INVALID COUNTRY";
        }
    }


    enum Country {
        IN,
        US,
        UK
    }

}
