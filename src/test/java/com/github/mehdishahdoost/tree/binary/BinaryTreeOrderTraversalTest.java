package com.github.mehdishahdoost.tree.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.stream.Collectors;

/**
 * @author Mehdi Shahdoost
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BinaryTreeOrderTraversalTest {

    private Node root;

    @BeforeAll
    public void init() {
        root = new Node("2", new Node("7", new Node("2"), new Node("6", new Node("5"), new Node("11"))),
                new Node("5", null, new Node("9", new Node("4"), null)));
    }

    @Test
    public void inorderTraverse() {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.traverse(root);
        Assertions.assertEquals(inOrderTraversal.getDatas().stream().collect(Collectors.joining(",")),
                "2,7,5,6,11,2,5,4,9");
    }

    @Test
    public void preorderTraverse() {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.traverse(root);
        Assertions.assertEquals(preOrderTraversal.getDatas().stream().collect(Collectors.joining(",")),
                "2,7,2,6,5,11,5,9,4");
    }

    @Test
    public void postorderTraverse() {
        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.traverse(root);
        Assertions.assertEquals(postOrderTraversal.getDatas().stream().collect(Collectors.joining(",")),
                "2,5,11,6,7,4,9,5,2");
    }
}
