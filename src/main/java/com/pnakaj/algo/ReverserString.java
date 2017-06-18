package com.pnakaj.algo;


/**
 * Created by pankaj on 3/30/2017.
 */
public class ReverserString {

    public static void main(String[] args) {
        System.out.println(reverse("kumar".toCharArray(),0,"kumar".length()-1));
    }

    public static String reverse(char src[],int start,int end) {

//        char destpp[] = new char[src.length()];
//        for (int i=src.length(),j=0;i>0;i--,j++) {
//            destpp[j] = src.charAt(i-1);
//        }

//        return new String();
//        char[] chars = src.toCharArray();
//        System.out.println(chars.length);
//        for (int i=chars.length,j=1;i>j; i--,j++){
//            char temp = chars[j];
//            chars[j] = chars[i];
//            chars[i] = temp;
//
//        }

        String data = "" ;
        if (start >= end) {
            System.out.println(new String(src));
            data= new String(src);
        } else {

            char temp = src[start];
            src[start] = src[end];
            src[end] = temp;

            reverse(src, ++start, --end);
        }
        return data;
    }
}
