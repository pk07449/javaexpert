package com.pnakaj.algo.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pankaj on 3/30/2017.
 */
public class FindDuplicateCharInString {

    public static void main(String[] args) {
        System.out.println(findDuplicateCharactor());
    }

    public static String findDuplicateCharactor() {
        String src = "pankaj";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char data : src.toCharArray()) {

            if (map.containsKey(data)) {

                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 2){
                return String.valueOf(entry.getKey());
            }

        }

        return "NotFount";


    }
}
