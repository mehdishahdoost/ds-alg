package com.github.mehdishahdoost.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class QueueWithArrayTest {

    @Test
    public void queueWithArray() {
        QueueWithArray queueWithArray = new QueueWithArray(5);
        queueWithArray.enqueue(1);
        queueWithArray.enqueue(2);
        queueWithArray.enqueue(3);
        Assertions.assertEquals(queueWithArray.dequeue(), 1);
        Assertions.assertEquals(queueWithArray.getCapacity(), 5);
        Assertions.assertEquals(queueWithArray.getSize(), 2);
        Assertions.assertEquals(queueWithArray.dequeue(), 2);
        Assertions.assertEquals(queueWithArray.dequeue(), 3);
    }
}
