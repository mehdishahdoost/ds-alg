package com.github.mehdishahdoost.array;

/**
 * find minimum element in sorted and rotated array
 *
 * @author Mehdi Shahdoost
 */
public class MinimumSortedRotatedArray {

    /**
     * O(log n)
     *
     * Compute mid i.e low+high/2.
     * Check if a[mid…high] is sorted
     * Minimum lies in left part, so low=mid+1;
     * Else
     * Minimum lies in right part, so high=mid
     */
    public int findMinimumElementInSortedRotatedArray(int[] arr, int low, int high) {
        int mid;
        while (low < high) {
            mid = (low + high) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }

}
