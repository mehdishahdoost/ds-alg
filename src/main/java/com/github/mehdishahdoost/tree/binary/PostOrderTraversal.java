package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;

/**
 * PreOrder Traversal: ThatNode - LeftNode - RightNode
 *
 * @author Mehdi Shahdoost
 */
public class PostOrderTraversal {

    private ArrayList<String> datas = new ArrayList<>();

    public void traverse(Node root) {
        if (root == null)
            return;
        traverse(root.getLeft());
        traverse(root.getRight());
        datas.add(root.getData());
    }

    public ArrayList<String> getDatas() {
        return this.datas;
    }
}
