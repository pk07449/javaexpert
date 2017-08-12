package com.pnakaj.algo;

/**
 * Created by pankaj on 4/8/2017.
 */
public class FabonicalSeriesWithRecursion {

    public static void main(String[] args) {
        generateFabonicalSeries(6,0,0);
    }

    private static void generateFabonicalSeries(int seriesNumberUpTo, int first,int second) {
        if(first == 0 && second == 0){
            System.out.println(first);
        }
        if(seriesNumberUpTo > 0) {
            int tempSecondNumber = second == 0 ? 1 : first + second;

            System.out.println(tempSecondNumber);
            generateFabonicalSeries(seriesNumberUpTo-1, second, tempSecondNumber);
        }


    }
}
