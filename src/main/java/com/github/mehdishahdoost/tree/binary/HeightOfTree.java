package com.github.mehdishahdoost.tree.binary;

/**
 * Get Height of a Binary Tree/Node
 * @author Mehdi Shahdoost
 */
public class HeightOfTree {

    public int getHeight(IntNode root) {
        if(root == null)
            return -1;
        return max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
