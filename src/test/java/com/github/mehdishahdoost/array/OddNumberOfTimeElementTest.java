package com.github.mehdishahdoost.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class OddNumberOfTimeElementTest {

    @Test
    public void findOddNumberOfTimeElement() {
        int[] arr = {1, 2, 1, 3, 3};
        OddNumberOfTimeElement oddNumberOfTimeElement = new OddNumberOfTimeElement();
        int oddNumberOfTimeElement1 = oddNumberOfTimeElement.findOddNumberOfTimeElement(arr);
        Assertions.assertEquals(oddNumberOfTimeElement1, 2);

    }

}
