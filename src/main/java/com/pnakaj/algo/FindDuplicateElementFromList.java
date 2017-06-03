package com.pnakaj.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by pankaj on 4/9/2017.
 */
public class FindDuplicateElementFromList {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("P");
        list.add("P");
        list.add("A");
        list.add("B");

        Map<String,Integer> map = new HashMap<String,Integer >();
        for (String s : list) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }


    }
}
