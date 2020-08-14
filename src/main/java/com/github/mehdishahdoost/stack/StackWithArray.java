package com.github.mehdishahdoost.stack;

/**
 * Stack is abstract data type which demonstrates Last in first out (LIFO) behavior
 * <p>
 * Implements Stack with Array.
 *
 * @author Mehdi Shahdoost
 */
public class StackWithArray {

    private int size;
    private int[] arr;
    private int top;

    public StackWithArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            this.top++;
            this.arr[top] = element;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            return arr[returnedTop];
        } else {
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (this.size - 1 == this.top);
    }

}
