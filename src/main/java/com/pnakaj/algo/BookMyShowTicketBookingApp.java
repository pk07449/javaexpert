package com.pnakaj.algo;

import java.util.*;

/**
 * Created by pankaj on 6/1/2017.
 */
public class BookMyShowTicketBookingApp {

    public static Map<String,List<String>> getAllSeats(){
        Map<String,List<String>> seats = new HashMap<String, List<String>>();
        seats.put("A",row());
        seats.put("B",row());
        seats.put("C",row());
        seats.put("D",row());
        seats.put("E",row());
        seats.put("F",row());
        seats.put("G",row());
        seats.put("H",row());
        seats.put("I",row());
        seats.put("J",row());
        seats.put("K",row());
        seats.put("L",row());
        seats.put("M",row());
        seats.put("S",row());
        seats.put("T",row());
        seats.put("U",row());
        seats.put("V",row());
        seats.put("W",row());
        seats.put("X",row());
        seats.put("Z",row());
        return seats;
    }

    private static List<String> row() {
        List<String> rowSeats = new ArrayList<String>();
        rowSeats.add("1");
        rowSeats.add("2");
        rowSeats.add("3");
        rowSeats.add("4");
        rowSeats.add("5");
        rowSeats.add("6");
        rowSeats.add("7");
        rowSeats.add("8");
        rowSeats.add("9");
        rowSeats.add("10");
        return  rowSeats;
    }

    public static void main(String[] args) {

        Map<String, List<String>> allSeats = getAllSeats();

        Thread t1= new Thread(){
            @Override
            public void run() {

            }
        };
    }
}
