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
public class BinaryTreeTraversalTest {

    private Node root;

    @BeforeAll
    public void beforeAll() {
        root = new Node("A", new
                Node("B", new Node("C"), new Node("D")),
                new Node("E", new Node("F"), new Node("G", new Node("H"), null)));
    }

    @Test
    public void traverse() {
        BfsTraversal bfsTraversal = new BfsTraversal();
        bfsTraversal.traverse(root);
        Assertions.assertEquals(bfsTraversal.getDatas().stream().collect(Collectors.joining(",")),
                "A,B,E,C,D,F,G,H");
    }

    @Test
    public void dfsTraverse() {
        DfsTraversal dfsTraversal = new DfsTraversal();
        dfsTraversal.traverse(root);
        Assertions.assertEquals(dfsTraversal.getDatas().stream().collect(Collectors.joining(",")),
                "A,B,C,D,E,F,G,H");
    }
}
