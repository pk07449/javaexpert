package com.yash.algo;

/**
 * Created by pankaj on 4/10/2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {

        int result = isPrime(16,2);

        System.out.println(result );
    }

    private static int isPrime(int number, int i) {

        if(i<number){
            if(number%i!=0) {
                return isPrime(number, ++i);
             } else {
                return 0;
            }


        }
        return 1;


    }


}
