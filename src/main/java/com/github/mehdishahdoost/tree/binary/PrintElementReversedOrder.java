package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;

/**
 *  Print Reverse Level order Traversal (Using Recursion)
 * @author Mehdi Shahdoost
 */
public class PrintElementReversedOrder {

    private ArrayList<Integer> datas = new ArrayList<>();

    public ArrayList<Integer> getDatas() {
        return this.datas;
    }

    public void traverse(IntNode root) {
        if (root == null)
            return;

        int height = getHeight(root);

        for (int i = height; i >= 0; i--) {
            printElementAtLevel(root, i);
        }
    }

    private void printElementAtLevel(IntNode root, int i) {
        if (root == null)
            return;
        if (i == 1) {
            datas.add(root.getData());
            return;
        }
        printElementAtLevel(root.getLeft(), i - 1);
        printElementAtLevel(root.getRight(), i - 1);
    }

    private int getHeight(IntNode root) {
        if (root == null)
            return 0;
        return max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
    }

    private int max(int left, int right) {
        return left > right ? left : right;
    }
}
