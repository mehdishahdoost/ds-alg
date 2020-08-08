package com.github.mehdishahdoost.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class SecondLargestElementTest {

    @Test
    public void findSecondLargestElement() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        int secondLargestElement1 = secondLargestElement.findSecondLargestElement(arr);
        Assertions.assertEquals(secondLargestElement1, 5);
    }
}
