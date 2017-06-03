package com.pnakaj.algo;

import java.util.Stack;

/**
 * Created by pankaj on 2/3/2017.
 */
public class CustomQueueTest {

    public static void main(String[] args) {
//       int i = 10;
//        i= i++;
//        System.out.println(i);

        CustomQueue<Integer> customQuee = new CustomQueue<Integer>();
        customQuee.push(10);
        customQuee.push(20);
        customQuee.push(30);
        customQuee.push(40);

        System.out.println(customQuee.peek());

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
//        priorityQueue.offer(10);
//        priorityQueue.offer(20);
//        priorityQueue.offer(30);
//        priorityQueue.offer(40);
//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.peek());

//        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());

    }

    static class CustomQueue<T> {

        private Stack<T> stack1 = new Stack<T>();
        private Stack<T> stack2 = new Stack<T>();

        public void push(T element) {
            stack1.push(element);
        }

        public T pop() {

            moveElement(stack1, stack2);
            return stack2.pop();
        }

        private void moveElement(Stack<T> stack1, Stack<T> stack2) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        public T peek() {
            moveElement(stack1, stack2);
            return stack2.peek();

        }


    }
}
