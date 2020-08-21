package com.github.mehdishahdoost.tree.binary;

/**
 * Get number of Leaf Nodes in Binary Tree
 *
 * @author Mehdi Shahdoost
 */
public class SumOfLeafNode {

    public int getNumberOfLeafNode(IntNode root) {
        if (root == null)
            return 0;
        if (root.getLeft() == null && root.getRight() == null)
            return 1;
        return getNumberOfLeafNode(root.getLeft()) + getNumberOfLeafNode(root.getRight());
    }
}
