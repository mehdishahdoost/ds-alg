package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Mehdi Shahdoost
 */
public class SubStringTest {

    @Test
    public void subStringTest() {
        ArrayList<String> results = new ArrayList<>();
        results.add("a");
        results.add("b");
        results.add("b");
        results.add("ab");
        results.add("bb");
        results.add("abb");
        SubString subString = new SubString();
        ArrayList<String> substrings = subString.findAllSubstring("abb");
        Assertions.assertEquals(substrings.size(), 6);
        for (String s : substrings)
            Assertions.assertTrue(results.contains(s));
    }

}
