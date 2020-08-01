package com.github.mehdishahdoost.array.rotate;

import java.util.*

class KRotateArray {
    /**
     * Right rotate array with java builtin Collections class.
     */
    fun rightRotate(arr: MutableList<Int>, d: Int) = Collections.rotate(arr, d)
    /**
     * Left rotate array with java builtin Collections class.
     */
    fun leftRotate(arr: MutableList<Int>, d: Int) = Collections.rotate(arr, -d)
}