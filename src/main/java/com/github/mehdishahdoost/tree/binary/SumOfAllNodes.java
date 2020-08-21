package com.github.mehdishahdoost.tree.binary;

/**
 * @author Mehdi Shahdoost
 */
public class SumOfAllNodes {

    public int getSumOfAllNodes(IntNode root) {
        if (root == null)
            return 0;
        return root.getData() + getSumOfAllNodes(root.getLeft()) + getSumOfAllNodes(root.getRight());
    }
}
