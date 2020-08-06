package com.github.mehdishahdoost.string;

import java.util.LinkedHashMap;

/**
 * How will you find first non repeating character in String
 *
 * @author Mehdi Shahdoost
 */
public class Repeated {

    /**
     * Get character while looping over String
     * Put this character in LinkedHashMap with count. If character is already there, increase count by 1.
     * Get count from LinkedHashMap while iterating. If count is 1,return that character as LinkedHashMap maintains
     * insertion order.
     */
    public Character findNonRepeatedChar(String word) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Character character : map.keySet()) {
            if (map.get(character) == 1)
                return character;
        }
        return null;
    }

    /**
     * Iterate through each character of string.
     * If lastIndexOf and indexOf return same value, then it is
     * first non repeating character in the String.
     */
    public Character findFirstNonRepeatedChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) == word.lastIndexOf(c))
                return c;
        }
        return null;
    }
}
