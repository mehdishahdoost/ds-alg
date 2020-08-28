package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;

/**
 * Print elements at given level in Binary Tree
 *
 * @author Mehdi Shahdoost
 */
public class PrintLevelElement {

    private ArrayList<String> prints = new ArrayList<>();

    public void printAtLevel(IntNode root, int level) {

        if (root == null)
            return;

        if (level == 1) {
            prints.add(root.getData() + " ");
            return;
        }
        printAtLevel(root.getLeft(), level - 1);
        printAtLevel(root.getRight(), level - 1);
    }

    public ArrayList<String> getData() {
        return this.prints;
    }
}
