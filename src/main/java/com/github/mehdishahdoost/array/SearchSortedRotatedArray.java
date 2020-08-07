package com.github.mehdishahdoost.array;

/**
 * search an element in a sorted and rotated array
 *
 * @author Mehdi Shahdoost
 */
public class SearchSortedRotatedArray {

    /**
     * O(log n)
     *
     * Compute mid i.e low+high/2.
     * Check if a[mid…high] is sorted
     * If number lies between the range , low=mid+1.
     * If number does not lie in the range, high=mid-1.
     * Check if a[low..mid] is sorted.
     * If number lies between the range, high=mid-1..
     * If number does not lie in the range,low=mid+1.
     */
    public int searchSortedAndRotatedArray(int[] array, int key, int low, int high) {
        int mid = (low + high) / 2;

        if (array[mid] == key)
            return mid;

        if (low > high)
            return -1;

        // left side sorted
        if (array[low] <= array[mid]) {
            if (array[low] <= key && array[mid] >= key) {
                return searchSortedAndRotatedArray(array, key, low, mid - 1);
            } else {
                return searchSortedAndRotatedArray(array, key, mid + 1, high);
            }
        } else { // right side sorted
            if (array[mid] <= key && array[high] >= key) {
                return searchSortedAndRotatedArray(array, key, mid + 1, high);
            } else {
                return searchSortedAndRotatedArray(array, key, low, mid - 1);
            }
        }
    }
}
