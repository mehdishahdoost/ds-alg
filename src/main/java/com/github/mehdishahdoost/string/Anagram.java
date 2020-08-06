package com.github.mehdishahdoost.string;

import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * Anagrams mean if two Strings have the same characters but in a different order.
 * For example: Angel and Angle are anagrams
 *
 * @author Mehdi Shahdoost
 */
public class Anagram {

    /**
     * If index of any character is -1, then two strings are not anagrams
     * If index of character is not equal to -1, then remove the character
     * from the String
     */
    public boolean isAnagramUsingStringMethods(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);

            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    /**
     * You can simply sort both the Strings using Arrays.sort() method. If both the Strings are equal after Sorting,
     * then these two Strings are anagram of each other.
     */
    public boolean isAnagramUsingSort(String word, String anagram) {
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);
        return sortedWord.equals(sortedAnagram);
    }


    private String sortChars(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        sort(chars);
        return String.valueOf(chars);
    }

}
