package com.github.mehdishahdoost.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class SmallestLargetElementTest {

    @Test
    public void findSmallestAndLargestElement() {
        int[] arr = {1, 2, 3, 4, 6};
        SmallestLargestArrayElement arrayElement = new SmallestLargestArrayElement();
        String smallestAndLargestElement = arrayElement.findSmallestAndLargestElement(arr);
        Assertions.assertEquals(smallestAndLargestElement, "1 6");
    }
}
