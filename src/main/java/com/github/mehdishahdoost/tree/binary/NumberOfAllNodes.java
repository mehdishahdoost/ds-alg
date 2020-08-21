package com.github.mehdishahdoost.tree.binary;

/**
 * @author Mehdi Shahdoost
 */
public class NumberOfAllNodes {

    public int getNumberOfAllNodes(IntNode root) {
        if (root == null)
            return 0;
        return 1 + getNumberOfAllNodes(root.getLeft()) + getNumberOfAllNodes(root.getRight());
    }
}
