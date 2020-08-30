package com.github.mehdishahdoost.tree.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

/**
 * @author Mehdi Shahdoost
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PrintElementReversedWithoutRecursionTest {

    private Node root;

    @BeforeAll
    public void init() {
        root = new Node("2", new Node("7", new Node("2"), new Node("6", new Node("5"), new Node("11"))),
                new Node("5", null, new Node("9", new Node("4"), null)));
    }

    @Test
    public void traverse() {
        PrintElementReversedWithoutRecursion withoutRecursion = new PrintElementReversedWithoutRecursion();
        withoutRecursion.traverse(root);
        ArrayList<String> datas = withoutRecursion.getDatas();
        String[] arr = {"5","11","4","2","6","9","7","5","2"};
        Assertions.assertArrayEquals(datas.toArray(), arr);
    }
}


