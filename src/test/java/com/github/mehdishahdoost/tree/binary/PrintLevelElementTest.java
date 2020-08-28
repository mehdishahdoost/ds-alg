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
public class PrintLevelElementTest {

    private IntNode root;

    @BeforeAll
    public void init() {
        root = new IntNode(2, new IntNode(7, new IntNode(2), new IntNode(6, new IntNode(5), new IntNode(11))),
                new IntNode(5, null, new IntNode(9, new IntNode(4), null)));
    }

    @Test
    public void printLevelTest() {
        PrintLevelElement printLevelElement = new PrintLevelElement();
        printLevelElement.printAtLevel(root, 3);
        Assertions.assertEquals(printLevelElement.getData().stream().collect(Collectors.joining(" ")), "2  6  9 ");
    }
}
