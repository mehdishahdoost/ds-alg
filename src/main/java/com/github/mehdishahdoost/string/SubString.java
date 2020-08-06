package com.github.mehdishahdoost.string;

import java.util.ArrayList;

/**
 * we will see java program to find all substrings of a String.
 * For example: If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
 *
 * @author Mehdi Shahdoost
 */
public class SubString {

    /**
     * Above solution is of o(n^3) time complexity. As we have two loops and also String’s substring method has a time
     * complexity of o(n)
     */
    public ArrayList<String> findAllSubstring(String word) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }
        return substrings;
    }
}
