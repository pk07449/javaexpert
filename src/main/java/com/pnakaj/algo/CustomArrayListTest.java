package com.pnakaj.algo;

/**
 * Created by pankaj on 4/1/2017.
 */
public class CustomArrayListTest {

    public static void main(String[] args) {

        CustomArrayList<Integer> list = new CustomArrayList<Integer>();

        list.add(new Integer(10));



    }
}

class CustomArrayList<T> {

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    transient Object[] elementData; //
    private int size;
    public  CustomArrayList() {
        elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public void add(T integer) {

    }
}
