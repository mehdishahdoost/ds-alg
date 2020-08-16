package com.github.mehdishahdoost.linkedlist;

/**
 * @author Mehdi Shahdoost
 */
class Node {
    public int data;
    public Node next;
}

public class SinglyLinkedList {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public Node peek() {
        return head;
    }

    public void insertFirst(int value) {
        Node node = new Node();
        node.data = value;
        node.next = head;
        head = node;
    }

    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void insertLast(int value) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node node = new Node();
        node.data = value;
        node.next = null;
        current.next = node;
    }

    public Node deleteLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node deleteNode = temp.next;
        temp.next = null;
        return deleteNode;
    }
}
