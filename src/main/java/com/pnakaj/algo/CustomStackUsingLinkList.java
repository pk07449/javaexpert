package com.pnakaj.algo;

import java.util.Stack;

/**
 * Created by pankaj on 2/3/2017.
 */
public class CustomStackUsingLinkList {

    public static void main(String[] args) {

        Stack<Integer> stackData = new Stack<Integer>();
        stackData.push(10);
        stackData.push(20);
        stackData.push(30);
        stackData.push(40);

        System.out.println(stackData.peek());

        MyCustomStackUnsgLinkList myCustomStackUnsgLinkList = new MyCustomStackUnsgLinkList();
        myCustomStackUnsgLinkList.push(10);
        myCustomStackUnsgLinkList.push(20);
        myCustomStackUnsgLinkList.push(30);
        myCustomStackUnsgLinkList.push(40);

        System.out.println(myCustomStackUnsgLinkList.peek());


    }

    static class  MyCustomStackUnsgLinkList {
        Node head;
        int size;

        public void push(Object element) {
           if(size==0) {
               head = new  Node(element);
               size ++;
           } else {
               Node temp = head;
               head = new  Node(element);
               head.next = temp;
               size++;
           }
        }

        public Object peek(){
            return head.data;
        }
    }

    static class Node {
        private Object data;
        public Node next;

        Node(Object data){
            this.data = data;
        }

    }

}