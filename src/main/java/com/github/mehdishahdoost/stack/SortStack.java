package com.github.mehdishahdoost.stack;

/**
 * @author Mehdi Shahdoost
 */
public class SortStack {
    private int size;
    private int[] arr;
    private int top;

    public SortStack(int size) {
        this.size = size;
        arr = new int[size];
        this.top = -1;
    }

    public boolean isFull() {
        return (this.top == this.size - 1);
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public int peek() {
        return this.arr[top];
    }

    public void push(int value) {
        if (!isFull()) {
            top++;
            this.arr[top] = value;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int topIndex = top;
            top--;
            return this.arr[topIndex];
        } else {
            return -1;
        }
    }

    public SortStack sort() {
        SortStack sortStack = new SortStack(this.size);
        while (!this.isEmpty()) {
            int element = this.pop();
            while (!sortStack.isEmpty() && sortStack.peek() > element) {
                this.push(sortStack.pop());
            }
            sortStack.push(element);
        }
        return sortStack;
    }
}
