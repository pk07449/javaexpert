package com.pnakaj.algo;

/**
 * Created by pankaj on 4/8/2017.
 */
public class FabonicalSeries {

    public static void main(String[] args) {
        generateFabonicalSeries(6,0,1);
    }

    private static void generateFabonicalSeries(int number, int first,int second) {
        if(number > 0) {
            int fabonicalNumberToPrint = first + second;
            System.out.println(fabonicalNumberToPrint);
            generateFabonicalSeries(number-1, second, fabonicalNumberToPrint);
        }
    }
}
