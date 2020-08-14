package com.github.mehdishahdoost.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class StackWithTwoQueueTest {

    @Test
    public void stackWithTwoQueue() {
        StackWithTwoQueue stackWithTwoQueueTest = new StackWithTwoQueue();
        stackWithTwoQueueTest.push(1);
        stackWithTwoQueueTest.push(2);
        stackWithTwoQueueTest.push(3);
        stackWithTwoQueueTest.push(4);
        stackWithTwoQueueTest.push(5);
        Assertions.assertEquals(stackWithTwoQueueTest.peek(), 5);
        Assertions.assertEquals(stackWithTwoQueueTest.pop(), 5);
        Assertions.assertEquals(stackWithTwoQueueTest.pop(), 4);
        Assertions.assertEquals(stackWithTwoQueueTest.pop(), 3);
        Assertions.assertEquals(stackWithTwoQueueTest.pop(), 2);
        Assertions.assertEquals(stackWithTwoQueueTest.peek(), 1);
    }
}
