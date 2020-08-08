package com.github.mehdishahdoost.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class MinimumSortedRotatedArrayTest {

    @Test
    public void findMinimumSortedRotatedArray() {
        int arr[] = {16, 19, 21, 25, 3, 5, 8, 10};
        MinimumSortedRotatedArray minimumSortedRotatedArray = new MinimumSortedRotatedArray();
        int minimumElementInSortedRotatedArray = minimumSortedRotatedArray.findMinimumElementInSortedRotatedArray(arr, 0, 7);
        Assertions.assertEquals( minimumElementInSortedRotatedArray, 3);
    }
}
