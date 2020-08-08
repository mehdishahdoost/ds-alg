package com.github.mehdishahdoost.array;

/**
 * Given an unsorted array, you need to find the second largest element in
 * the array in o(n) time complexity.
 * @author Mehdi Shahdoost
 */
public class SecondLargestElement {

    /**
     * Initialize highest and secondHighest with minimum possible value.
     * Iterate over array.
     * If current element is greater than highest
     * Assign secondHighest = highest
     * Assign highest = currentElement
     * Else if current element is greater than secondHighest
     * Assign secondHighest =current element.
     *
     */
    public int findSecondLargestElement(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }

}
