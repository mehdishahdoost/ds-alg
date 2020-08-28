package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;

/**
 * Print elements in Level order (Using Recursion)
 *
 * @author Mehdi Shahdoost
 */
public class PrintElementsLevelOrder {

    public ArrayList<String> print(IntNode root) {
        PrintLevelElement printLevelElement = new PrintLevelElement();
        HeightOfTree heightOfTree = new HeightOfTree();
        int height = heightOfTree.getHeight(root);

        for (int i = 0; i <= height; i++) {
            printLevelElement.printAtLevel(root, i + 1);
        }
        return printLevelElement.getData();
    }

}
