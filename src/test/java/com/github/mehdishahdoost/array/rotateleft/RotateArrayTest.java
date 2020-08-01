package com.github.mehdishahdoost.array.rotateleft;

import com.github.mehdishahdoost.array.rotate.KRotateArray;
import com.github.mehdishahdoost.array.rotate.RotateArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Mehdi Shahdoost
 */
public class RotateArrayTest {

    @Test
    public void rightRotate() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rightRotate(arr, 2);
        Assertions.assertEquals(arr.length, 6);
        Assertions.assertEquals(arr[0], 5);
        Assertions.assertEquals(arr[1], 6);
        Assertions.assertEquals(arr[4], 3);
        Assertions.assertEquals(arr[5], 4);
    }

    /**
     * Kotlin right rotate
     */
    @Test
    public void kRightRotate() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        KRotateArray rotateArray = new KRotateArray();
        rotateArray.rightRotate(Arrays.asList(arr), 2);
        Assertions.assertEquals(arr.length, 6);
        Assertions.assertEquals(arr[0], 5);
        Assertions.assertEquals(arr[1], 6);
        Assertions.assertEquals(arr[4], 3);
        Assertions.assertEquals(arr[5], 4);
    }

    @Test
    public void leftRotate() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        RotateArray rotateArray = new RotateArray();
        rotateArray.leftRotate(arr, 2);
        Assertions.assertEquals(arr.length, 6);
        Assertions.assertEquals(arr[0], 3);
        Assertions.assertEquals(arr[1], 4);
        Assertions.assertEquals(arr[4], 1);
        Assertions.assertEquals(arr[5], 2);
    }

    /**
     * Kotlin left rotate
     */
    @Test
    public void kLeftRotate() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        KRotateArray rotateArray = new KRotateArray();
        rotateArray.leftRotate(Arrays.asList(arr), 2);
        Assertions.assertEquals(arr.length, 6);
        Assertions.assertEquals(arr[0], 3);
        Assertions.assertEquals(arr[1], 4);
        Assertions.assertEquals(arr[4], 1);
        Assertions.assertEquals(arr[5], 2);
    }

    @Test
    public void rotateToLeftArrayOneByOne() {
        int[] arr = {1,2,3,4};
        RotateArray rotateArray = new RotateArray();
        int[] arr2 = rotateArray.simpleLeftRotateOneByOne(arr);
        Assertions.assertEquals(arr2[0], 2);
        Assertions.assertEquals(arr2[3], 1);
    }

    @Test
    public void rotateToRightArrayOneByOne() {
        int[] arr = {1,2,3,4};
        RotateArray rotateArray = new RotateArray();
        int[] arr2 = rotateArray.simpleRightRotateOneByOne(arr);
        Assertions.assertEquals(arr2[0], 4);
        Assertions.assertEquals(arr2[3], 3);
    }
}
