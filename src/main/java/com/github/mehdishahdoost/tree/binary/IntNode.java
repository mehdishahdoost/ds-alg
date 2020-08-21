package com.github.mehdishahdoost.tree.binary;

/**
 * @author Mehdi Shahdoost
 */
public class IntNode {
    private int data;
    private IntNode left;
    private IntNode right;

    public IntNode(int value) {
        this.data = value;
    }

    public IntNode(int value, IntNode left, IntNode right) {
        this.data = value;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public IntNode getLeft() {
        return left;
    }

    public void setLeft(IntNode left) {
        this.left = left;
    }

    public IntNode getRight() {
        return right;
    }

    public void setRight(IntNode right) {
        this.right = right;
    }
}
