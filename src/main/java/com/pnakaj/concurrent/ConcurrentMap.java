package com.pnakaj.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by pankaj on 4/11/2017.
 */
public class ConcurrentMap {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap();
        myMap.put("1","a");
        myMap.put("2","b");
        myMap.put("3","c");
        myMap.put("4","d");

        Iterator it1 = myMap.keySet().iterator();
        while (it1.hasNext()){
            it1.next();
            myMap.put("1","pankaj");
        }
        System.out.println(myMap);

        Iterator it2 = myMap.keySet().iterator();
        while(it2.hasNext()){
            it2.next();
            myMap.put("d","");
        }

    }
}
