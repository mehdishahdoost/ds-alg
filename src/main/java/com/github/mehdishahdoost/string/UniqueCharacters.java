package com.github.mehdishahdoost.string;

import java.util.HashSet;

/**
 * How to check if String has all unique character
 *
 * @author Mehdi Shahdoost
 */
public class UniqueCharacters {

    public boolean isUniqueChar(String text) {
        HashSet<Character> alphaSet = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!alphaSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * If indexOf and lastIndexOf returns same value for the character,
     * then it is not repeated in that String.
     *
     */
    public boolean isUniqueCharUsingIndexOf(String text) {

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (text.indexOf(c) != text.lastIndexOf(c))
                return false;
        }
        return true;
    }

}
