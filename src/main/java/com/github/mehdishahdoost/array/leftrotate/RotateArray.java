package com.github.mehdishahdoost.array.leftrotate;

import java.util.Arrays;
import java.util.Collections;

/**
 *
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
}