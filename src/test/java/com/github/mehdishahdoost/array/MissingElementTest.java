package com.github.mehdishahdoost.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class MissingElementTest {

    @Test
    public void findMissingElementTest() {
        int[] arr = {1, 6, 5, 2, 3};
        MissingElement missingElement = new MissingElement();
        int missingElement1 = missingElement.findMissingElement(arr);
        Assertions.assertEquals(missingElement1, 4);
    }
}
