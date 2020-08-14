package com.github.mehdishahdoost.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class SortStackTest {

    @Test
    public void sortStackTest() {
        SortStack sortStack = new SortStack(5);
        sortStack.push(1);
        sortStack.push(2);
        sortStack.push(5);
        sortStack.push(6);
        sortStack.push(3);
        SortStack sort = sortStack.sort();
        Assertions.assertEquals(sort.peek(), 6);
        sort.pop();
        Assertions.assertEquals(sort.peek(), 5);
        sort.pop();
        Assertions.assertEquals(sort.peek(), 3);
        sort.pop();
        Assertions.assertEquals(sort.peek(), 2);
        sort.pop();
        Assertions.assertEquals(sort.peek(), 1);
    }
}
