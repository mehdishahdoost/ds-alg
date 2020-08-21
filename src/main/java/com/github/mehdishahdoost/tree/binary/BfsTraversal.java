package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Mehdi Shahdoost
 */
public class BfsTraversal {

    private ArrayList<String> datas = new ArrayList<>();

    public void traverse(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node remove = queue.remove();
            datas.add(remove.getData());
            if (remove.getLeft() != null)
                queue.add(remove.getLeft());
            if (remove.getRight() != null)
                queue.add(remove.getRight());
        }
    }

    public ArrayList<String> getDatas() {
        return this.datas;
    }
}
