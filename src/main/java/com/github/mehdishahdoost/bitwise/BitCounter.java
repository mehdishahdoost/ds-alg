package com.github.mehdishahdoost.bitwise;

/**
 * The bitCount() method of Integer class of java.lang package returns the count
 * of the number of one-bits in the two’s complement binary representation of an
 * int value. This function is sometimes referred to as the population count.
 */
public class BitCounter {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.bitCount(8));
    }
}
