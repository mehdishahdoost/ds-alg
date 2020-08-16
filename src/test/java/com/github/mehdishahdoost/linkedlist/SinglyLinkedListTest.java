package com.github.mehdishahdoost.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class SinglyLinkedListTest {

    @Test
    public void singlyLinkedListTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertFirst(2);
        Assertions.assertEquals(singlyLinkedList.peek().data, 2);
        singlyLinkedList.deleteFirst();
        Assertions.assertEquals(singlyLinkedList.peek().data, 1);
        singlyLinkedList.insertLast(3);
        Assertions.assertEquals(singlyLinkedList.peek().data, 1);
        Assertions.assertEquals(singlyLinkedList.peek().next.data, 3);
    }
}
