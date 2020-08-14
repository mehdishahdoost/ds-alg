package com.github.mehdishahdoost.queue;

/**
 * @author Mehdi Shahdoost
 */
public class QueueWithArray {
    private int capacity;
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public QueueWithArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int i) {
        if (!isFull()) {
            rear++;
            this.arr[rear] = i;
            this.size++;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int i = this.arr[front];
            front++;
            size--;
            return i;
        } else {
            return -1;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if (size == capacity)
            return true;
        return false;
    }
}
