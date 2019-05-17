package com.pnakaj.algo.dataStructure;

/**
 * Created by pankaj on 5/17/2019.
 */
public class findIfLinkedListContainsLoopsCycleCyclicCircularCheck {

/*
1) Use two pointers fast and slow
2) Move fast two nodes and slow one node in each iteration
3) If fast and slow meet then linked list contains cycle
4) if fast points to null or fast.next points to null then linked list is not cyclic
*/

        public static void main(String args[]) {

            LinkedList linkedList = new LinkedList();
            LinkedList.Node head = linkedList.head();
            linkedList.add( new LinkedList.Node("1"));
            linkedList.add( new LinkedList.Node("2"));
            linkedList.add( new LinkedList.Node("3"));
            linkedList.add( new LinkedList.Node("4"));

            System.out.println(linkedList.isCyclic());

        }

    public static class LinkedList {
        private Node head;
        private Node tail;
        public LinkedList() {
            this.head = new Node("head");
            this.tail = new Node("tail");
        }
        public Node head() { return head;}

        public void add(Node node){
            tail.next = node;
            tail = node;
        }

        /*
         * If singly LinkedList contains Cycle then following would be true
         * 1) slow and fast will point to same node i.e. they meet
         * On the other hand if fast will point to null or next node of
         * fast will point to null then LinkedList does not contains cycle.
         */
        public boolean isCyclic(){
            Node fast = head;
            Node slow = head;

            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                //if fast and slow pointers are meeting then LinkedList is cyclic
                if(fast == slow ){
                    return true;
                }
            }
            return false;
        }

        public static class Node {
            private Node next;
            private String data;

            public Node(String data) {
                this.data = data;
            }

            public String data() { return data; }
            public void setData(String data) { this.data = data;}

            public Node next() { return next; }
            public void setNext(Node next) { this.next = next; }

            @Override
            public String toString() {
                return this.data;
            }
        }
    }
}
