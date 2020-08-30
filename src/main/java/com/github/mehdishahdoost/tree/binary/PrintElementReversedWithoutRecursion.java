package com.github.mehdishahdoost.tree.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Reverse Level Order Traversal without using recursion
 *
 * @author Mehdi Shahdoost
 */
public class PrintElementReversedWithoutRecursion {

    ArrayList<String> datas = new ArrayList<>();

    public void traverse(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Stack<Node> stack = new Stack<>();
        while (!queue.isEmpty()) {
            Node remove = queue.remove();

            if (remove.getRight() != null)
                queue.add(remove.getRight());
            if (remove.getLeft() != null)
                queue.add(remove.getLeft());

            stack.add(remove);
        }

        while (!stack.empty()) {
            datas.add(stack.pop().getData());
        }
    }

    public ArrayList<String> getDatas() {
        return this.datas;
    }
}
