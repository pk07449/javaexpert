package com.pnakaj.algo;

/**
 * Created by pankaj on 2/10/2018.
 */
public class ArraySorting {

    public static void main(String[] args) {
        int a [] = new int[]{2,1,20,5};

        System.out.println("Before sorting");
        for (int i : a) {
            System.out.print(i);

        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {

                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
        System.out.println("After sorting");
        for (int i : a) {
            System.out.print(i+",");

        }
    }
}
