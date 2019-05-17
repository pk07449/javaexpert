package com.pnakaj.algo.array;

import java.util.Arrays;

/**
 * Created by pankaj on 5/16/2019.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        findMissedNumber(new int[]{1, 2, 3, 4, 6});
    }

    private static void findMissedNumber(int[] numbers) {
        final int[] missingField = {0};
        Arrays.stream(numbers).forEach(n ->{
            if(n-missingField[0] >= 2) {
                System.out.println((n+missingField[0])/2);
            }
            missingField[0] = n;
        });
    }
}
