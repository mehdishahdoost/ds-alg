package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class StringOperationTest {

    @Test
    public void reverseWithRecursionTest() {
        StringOperation stringOperation = new StringOperation();
        String reversed = stringOperation.reverseWithRecursive("mehdi");
        Assertions.assertEquals(reversed, "idhem");
    }

    @Test
    public void reverseTest() {
        StringOperation stringOperation = new StringOperation();
        String reversed = stringOperation.reverse("mehdi");
        Assertions.assertEquals(reversed, "idhem");
    }

    @Test
    public void reverseForLoopTest() {
        StringOperation stringOperation = new StringOperation();
        String reversed = stringOperation.reverseWithForLoop("mehdi");
        Assertions.assertEquals(reversed, "idhem");
    }
}
