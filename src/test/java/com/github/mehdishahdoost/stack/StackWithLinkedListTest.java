package com.github.mehdishahdoost.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class StackWithLinkedListTest {

    @Test
    public void stackLinkedList() {
        StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
        stackWithLinkedList.push(1);
        stackWithLinkedList.push(2);
        stackWithLinkedList.push(3);
        stackWithLinkedList.push(4);
        stackWithLinkedList.push(5);
        Assertions.assertEquals(stackWithLinkedList.peek(), 5);
        Assertions.assertEquals(stackWithLinkedList.pop(), 5);
        stackWithLinkedList.push(6);
        Assertions.assertEquals(stackWithLinkedList.peek(), 6);
        Assertions.assertEquals(stackWithLinkedList.pop(), 6);
        Assertions.assertEquals(stackWithLinkedList.pop(), 4);
        Assertions.assertEquals(stackWithLinkedList.pop(), 3);
        Assertions.assertEquals(stackWithLinkedList.pop(), 2);
        Assertions.assertEquals(stackWithLinkedList.pop(), 1);
        Assertions.assertEquals(stackWithLinkedList.pop(), -1);
    }
}
