package com.pnakaj.algo;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by pankaj on 2/4/2017.
 */
public class KthSmallestElementInArrayWithRecursion {

    public static int find(int [] elements, int k){

        Queue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0;i<elements.length;i++){
            queue.offer(elements[i]);
        }

        return findKthSmallestElement(k, queue, -1);
    }

    private static int findKthSmallestElement(int k, Queue<Integer> queue, int dataToBeReturn) {
        if(k > 0) {
            return findKthSmallestElement(--k, queue,queue.poll());
        } else {
            return dataToBeReturn;
        }
    }

    public static void main(String[] args) {
        int[] elements = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
        System.out.println("4th smallest element:" + find(elements,4));

    }
}
