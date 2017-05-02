package com.yash.algo;


/**
 * Created by pankaj on 4/8/2017.
 */
public class ReverseSingleList {

    public static void main(String[] args) {

        SingleLinkList<String> singleLinkList = new SingleLinkList<String>();
        singleLinkList.add("1");
        singleLinkList.add("2");
        singleLinkList.add("3");
        singleLinkList.add("4");

        singleLinkList.traverse();
        singleLinkList.reverse();
        singleLinkList.traverse();
    }
}

class SingleLinkList<S> {

    private Node head;

    public SingleLinkList() {
    }

    public void add(S element) {
        if (head == null) {
            head = new Node(null, element);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(null, element);

        }
    }

    public void traverse() {

        Node current = head;
        System.out.println(head);

        while (current != null) {
            System.out.println(current.data);
                current = current.next;
        }

    }

    public void reverse() {

        Node current = head;
        Node next = null;
        Node prev = null;

        while (current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;


    }

    @Override
    public String toString() {
        return "SingleLinkList{" +
                "head=" + head +
                '}';
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Node next, Object data) {
            this.next = next;
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }


}
