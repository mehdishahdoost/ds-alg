package com.github.mehdishahdoost.tree.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Mehdi Shahdoost
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DifferenceOfOddAndEvenLevelTest {

    private IntNode root;

    @BeforeAll
    public void init() {
        root = new IntNode(2, new IntNode(7, new IntNode(2), new IntNode(6, new IntNode(5), new IntNode(11))),
                new IntNode(5, null, new IntNode(9, new IntNode(4), null)));
    }

    @Test
    public void getDifference(){
        DifferenceOfOddAndEvenLevel difference = new DifferenceOfOddAndEvenLevel();
        int difference1 = difference.getDifference(root);
        Assertions.assertEquals(difference1, -13);
    }

}
