package com.pnakaj.collection.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by pankaj on 1/20/2018.
 */
public class FailsafeIterator {
    public static void main(String[] args) throws InterruptedException {
        arrayListFailFastIterator();
//        arrayListFailSafeIterator();
    }

    private static void arrayListFailFastIterator() {
        List<String> data = Arrays.asList("a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a");
        List<String> list = new ArrayList<>(data);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            list.add("kumar");      //This will throw ConcurrentModificationException
        }
    }

    private static void arrayListFailSafeIterator() {
        List<String> data = Arrays.asList("a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a");
        List<String> list = new CopyOnWriteArrayList(data);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            list.add("kumar");
        }
    }
}
