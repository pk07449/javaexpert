package com.pnakaj.algo.number;

/**
 * Created by pankaj on 4/9/2017.
 */
public class PalindromNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrom("123456"));
        System.out.println(isPalindrom("121"));

    }

    private static boolean isPalindrom(String data) {

        if (isSingleChar(data)) {
            return true;
        } else{
            if (isFirstAndLastCharIsSame(data)) {
                return isPalindrom(data.substring(1, data.length() - 1));
            } else {
                return false;
            }

        }
    }

    private static boolean isFirstAndLastCharIsSame(String data) {
        return data.charAt(0) == data.charAt(data.length() - 1);
    }

    private static boolean isSingleChar(String data) {
        return data.length() == 0 || data.length() == 1;
    }


}
