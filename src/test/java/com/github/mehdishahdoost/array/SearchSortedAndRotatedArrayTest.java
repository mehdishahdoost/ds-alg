package com.github.mehdishahdoost.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class SearchSortedAndRotatedArrayTest {

    @Test
    public void searchSortedAndRotatedArray() {
        int[] arr = {4,5,1,2,3};
        SearchSortedRotatedArray searchSortedRotatedArray = new SearchSortedRotatedArray();
        int i = searchSortedRotatedArray.searchSortedAndRotatedArray(arr, 2, 0, 4);
        Assertions.assertEquals(i, 3);
    }

}
