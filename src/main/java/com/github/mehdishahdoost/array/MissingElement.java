package com.github.mehdishahdoost.array;

/**
 * You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. You need to provide optimum solution to find the missing number.
 * Number can not be repeated in the arry.
 *
 * @author Mehdi Shahdoost
 */
public class MissingElement {

    /**
     * Find the sum of n number using formula n=n*(n+1)/2
     * Find the sum of elements present in given array.
     * Substract (sum of n numbers – sum of elements present in the array).
     */
    public int findMissingElement(int[] array) {
        int n = array.length + 1;
        int sum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return sum - arraySum;
    }
}
