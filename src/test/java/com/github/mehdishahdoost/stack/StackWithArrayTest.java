package com.github.mehdishahdoost.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class StackWithArrayTest {

    @Test
    public void stack() {
        StackWithArray stack = new StackWithArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Assertions.assertEquals(stack.isFull(), true);
        Assertions.assertEquals(stack.peek(), 5);
        Assertions.assertEquals(stack.pop(), 5);
        Assertions.assertEquals(stack.pop(), 4);
        Assertions.assertEquals(stack.pop(), 3);
        Assertions.assertEquals(stack.isFull(), false);
        Assertions.assertEquals(stack.pop(), 2);
        Assertions.assertEquals(stack.pop(), 1);
        Assertions.assertEquals(stack.pop(), -1);
        Assertions.assertEquals(stack.isFull(), false);
        Assertions.assertEquals(stack.isEmpty(), true);
    }
}
