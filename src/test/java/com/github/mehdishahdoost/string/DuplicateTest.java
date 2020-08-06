
package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class DuplicateTest {

    @Test
    public void hasDuplicateTest() {
        Duplicate duplicate = new Duplicate();
        boolean hasDuplicated = duplicate.hasDuplicateCharacters("balloon");
        boolean hasNotDuplicated = duplicate.hasDuplicateCharacters("mehdi");
        Assertions.assertTrue(hasDuplicated);
        Assertions.assertFalse(hasNotDuplicated);
    }

    @Test
    public void findDuplicateTest() {
        Duplicate duplicate = new Duplicate();
        String duplicateChars = duplicate.findDuplicateCharacters("balloon");
        Assertions.assertEquals(duplicateChars, "l\no\n");
    }
}
