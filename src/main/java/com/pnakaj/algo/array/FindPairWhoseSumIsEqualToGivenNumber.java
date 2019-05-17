package com.pnakaj.algo.array;

import java.util.Arrays;

/**
 * Created by pankaj on 5/17/2019.
 */
public class FindPairWhoseSumIsEqualToGivenNumber {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        findPairForGivenNumber(numbers,7);
    }

    private static void findPairForGivenNumber(int[] numbers, int givenNumber) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int nextIndex = numbers[j];
                int currentIndex= numbers[i];
                if(currentIndex + nextIndex == givenNumber) {
                    System.out.println(""+numbers[i] +"+" +nextIndex+" =" + givenNumber);
                }
            }
        }
    }
}
