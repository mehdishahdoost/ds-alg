package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;

/**
 * InOrder Traversal: LeftNode - ThatNode - RightNode
 *
 * @author Mehdi Shahdoost
 */
public class InOrderTraversal {

    private ArrayList<String> datas = new ArrayList<>();

    public void traverse(Node root) {
        if (root == null)
            return;
        traverse(root.getLeft());
        datas.add(root.getData());
        traverse(root.getRight());
    }

    public ArrayList<String> getDatas() {
        return this.datas;
    }

}
