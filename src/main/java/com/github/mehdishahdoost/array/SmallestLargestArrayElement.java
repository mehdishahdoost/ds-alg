package com.github.mehdishahdoost.array;

/**
 * Find Smallest and Largest Element in an Array
 *
 * @author Mehdi Shahdoost
 */
public class SmallestLargestArrayElement {

    /**
     * Initialise two variable largest and smallest with arr[0]
     * Iterate over array
     * If current element is greater than largest, then assign current element to largest.
     * If current element is smaller than smallest, then assign current element to smallest.
     * You will get smallest and largest element in the end.
     */
    public String findSmallestAndLargestElement(int[] array) {
        int smallest = array[0];
        int largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest)
                largest = array[i];
            else if (array[i] < smallest)
                smallest = array[i];
        }
        return String.format("%d %d", smallest, largest);
    }


}
