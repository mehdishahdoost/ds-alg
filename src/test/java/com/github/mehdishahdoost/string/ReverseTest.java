package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class ReverseTest {

    @Test
    public void reverseWithRecursionTest() {
        Reverse reverse = new Reverse();
        String reversed = reverse.reverseWithRecursive("mehdi");
        Assertions.assertEquals(reversed, "idhem");
    }

    @Test
    public void reverseTest() {
        Reverse reverse = new Reverse();
        String reversed = reverse.reverse("mehdi");
        Assertions.assertEquals(reversed, "idhem");
    }

    @Test
    public void reverseForLoopTest() {
        Reverse reverse = new Reverse();
        String reversed = reverse.reverseWithForLoop("mehdi");
        Assertions.assertEquals(reversed, "idhem");
    }
}
