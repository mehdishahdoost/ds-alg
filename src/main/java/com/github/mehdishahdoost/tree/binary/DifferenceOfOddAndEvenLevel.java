package com.github.mehdishahdoost.tree.binary;

/**
 * Get difference of values at Even & Odd level in binary tree
 * <p>
 * Time complexity: O(N)
 *
 * @author Mehdi Shahdoost
 */
public class DifferenceOfOddAndEvenLevel {

    public int getDifference(IntNode root) {
        if (root == null)
            return 0;
        return root.getData() - getDifference(root.getLeft()) - getDifference(root.getRight());
    }
}
