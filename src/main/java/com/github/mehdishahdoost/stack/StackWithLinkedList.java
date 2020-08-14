package com.github.mehdishahdoost.stack;

/**
 * @author Mehdi Shahdoost
 */
public class StackWithLinkedList {
    Node head;

    private class Node {
        int data;
        Node next;
    }

    public StackWithLinkedList() {
        head = null;
    }

    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.data = value;
        head.next = oldHead;
    }

    public int pop() {
        if (head != null) {
            int val = head.data;
            head = head.next;
            return val;
        } else {
            return -1;
        }
    }

    public int peek() {
        if (head != null) {
            return head.data;
        } else {
            return -1;
        }
    }
}
