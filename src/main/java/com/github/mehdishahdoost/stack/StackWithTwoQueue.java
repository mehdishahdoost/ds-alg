package com.github.mehdishahdoost.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Push :
 * If queue1 is empty, add elements to queue1
 * If queue1 is not empty, add all elements of queue1 to queue2 , add current element to queue1 and copy all elements of queue2 to queue1.
 * Pop :
 *
 * Simply remove element from queue1.
 *
 * @author Mehdi Shahdoost
 */
public class StackWithTwoQueue {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackWithTwoQueue() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int i) {
        if (q1.isEmpty()) {
            q1.add(i);
        } else {
            int q1Size = q1.size();
            for (int j = 0; j < q1Size; j++) {
                q2.add(q1.remove());
            }
            q1.add(i);
            for (int j = 0; j < q1Size; j++) {
                q1.add(q2.remove());
            }
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int peek() {
        return q1.peek();
    }
}
