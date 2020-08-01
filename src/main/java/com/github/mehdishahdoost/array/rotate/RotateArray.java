package com.github.mehdishahdoost.array.rotate;

import com.github.mehdishahdoost.math.gcd.GCD;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Mehdi Shahdoost
 */
public class RotateArray {

    /**
     * Rotates with use of java collections. This works with Integer[] not int[]
     */
    public void rightRotate(Integer[] arr, int d) {
        Collections.rotate(Arrays.asList(arr), d);
    }

    /**
     * Rotates with use of java collections. This works with Integer[] not int[]
     */
    public void leftRotate(Integer[] arr, int d) {
        Collections.rotate(Arrays.asList(arr), -d);
    }

    /**
     * rotate array to left by one
     * Time Space O(n)
     * Auxiliary space O(n)
     */
    public int[] simpleLeftRotateOneByOne(int[] arr) {
        // create temp array with size of original array
        int[] tempArr = new int[arr.length];
        for (int i = 1; i < arr.length - 1; i++) {
            tempArr[i - 1] = arr[i];
        }
        tempArr[arr.length - 1] = arr[0];
        return tempArr;
    }

    /**
     * Simple rotate array to right by one
     * Time Space: O(n)
     * Auxiliary Space: O(n)
     */
    public int[] simpleRightRotateOneByOne(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i + 1] = arr[i];
        }
        temp[0] = arr[arr.length - 1];
        return temp;
    }
}