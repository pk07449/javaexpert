package com.pnakaj.algo;

/**
 * Created by pankaj on 3/31/2017.
 */
public class PermutationOfString {

    public static void main(String[] args) {
        String src = "12";

        Permutation permutation = new Permutation();
//        permutation.permutation(src.toCharArray(), 0, src.toCharArray().length);
        permutation.permutation(src.toCharArray(), 0, src.toCharArray().length);

    }


    private static class Permutation {

        public void permutation(char datas[], int start, int end) {

            if (start == end) {
                System.out.println(datas);
            } else {

                for (int tempStart = start; tempStart < end; tempStart++) {
                    swap(datas, start, tempStart);
                    permutation(datas, start + 1, end);
                    swap(datas, start, tempStart);
                }

            }
        }

        private void swap(char[] datas, int start, int end) {
            char temp = datas[start];
            datas[start] = datas[end];
            datas[end] = temp;
        }


    }
}
