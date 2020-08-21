package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;

/**
 * @author Mehdi Shahdoost
 */
public class DfsTraversal {

    private ArrayList<String> datas = new ArrayList<>();

    public void traverse(Node root) {
        if(root == null)
            return;
        datas.add(root.getData());
        traverse(root.getLeft());
        traverse(root.getRight());
    }

    public ArrayList<String> getDatas() {
        return this.datas;
    }
}
