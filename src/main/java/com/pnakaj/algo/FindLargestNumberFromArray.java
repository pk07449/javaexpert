package com.pnakaj.algo;

import java.util.stream.IntStream;

/**
 * Created by pankaj on 7/14/2017.
 */
public class FindLargestNumberFromArray {

    public static void main(String[] args) {
        System.out.println(findLargestNumber(new int[] {9,8, 6, 5, 12}));
    }

    private static int findLargestNumber(int[] nmbers) {

        int max = nmbers[0];
        for (int i=0;i<nmbers.length;i++) {
            if(max<nmbers[i]) {
                max = nmbers[i];
            }
        }
        return max;
    }
}
