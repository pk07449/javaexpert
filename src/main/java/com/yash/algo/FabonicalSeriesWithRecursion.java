package com.yash.algo;

/**
 * Created by pankaj on 4/8/2017.
 */
public class FabonicalSeriesWithRecursion {

    public static void main(String[] args) {
        generateFabonicalSeries(6,0,1);
    }

    private static void generateFabonicalSeries(int seriesNumberUpTo, int first,int second) {
        if(seriesNumberUpTo > 0) {
            System.out.println(first+second);
            generateFabonicalSeries(seriesNumberUpTo-1, second, first+second);
        }


    }
}
