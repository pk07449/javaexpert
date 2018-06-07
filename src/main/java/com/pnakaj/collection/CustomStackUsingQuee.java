package com.pnakaj.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by pankaj on 2/3/2017.
 */
public class CustomStackUsingQuee {

    public static void main(String[] args) {
//       int i = 10;
//        i= i++;
//        System.out.println(i);

        CustomStack<Integer> customQuee = new CustomStack<Integer>();
        customQuee.push(10);
        customQuee.push(20);
        customQuee.push(30);
        customQuee.push(40);

        System.out.println(customQuee.pop());
    }

    static class CustomStack<T> {

        private Queue<T> quee1 = new LinkedList<T>();
        private Queue<T> quee2 = new LinkedList<T>();

        public void push(T element) {
            quee1.add(element);
        }

        public T pop() {
            moveElement(quee1, quee2);
            T top = quee1.poll();

            Queue<T> temp = quee1;
            quee1 = quee2;
            quee2 = temp;

            return top;
        }

        private void moveElement(Queue<T> queue1, Queue<T> queue2) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
        }
    }
}
