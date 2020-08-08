package com.github.mehdishahdoost.array;

/**
 * Find the number occurring odd number of times in an array with
 * O(n) time complexity and O(1) space complexity
 *
 * @author Mehdi Shahdoost
 */
public class OddNumberOfTimeElement {

    /**
     * x ^ x = 0
     * x ^ 0 = X
     * <p>
     * odd number of xor of x = x
     * even number of xor of x = 0
     */
    public int findOddNumberOfTimeElement(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
