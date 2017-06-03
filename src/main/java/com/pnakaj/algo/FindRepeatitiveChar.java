package com.pnakaj.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pankaj on 3/30/2017.
 */
public class FindRepeatitiveChar {

    public static void main(String[] args) {
//        checkAndReturn();

        System.out.println(findDuplicateCharactor());
    }

    private static void checkAndReturn() {
        String src = "pankaj";

        for (int i = 0; i < src.length(); i++) {
            int count = 0;
            char charToFind = src.charAt(i);

            System.out.println("First Loop " + charToFind);

            for (int j = 0; j < src.length() && count < 2; j++) {
                System.out.println("           Second Loop " + src.charAt(j));
                if (src.charAt(j) == charToFind) {
                    count++;
                    System.out.println("                       counter increased " + count);
                }
            }

            if (count == 2) {
                System.out.println(charToFind);
                System.out.println(count);

                break;

            }

        }
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
