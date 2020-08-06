package com.github.mehdishahdoost.string;

import java.util.HashMap;
import java.util.HashSet;

/**
 * finds duplicate Characters in a String
 *
 * @author Mehdi Shahdoost
 */
public class Duplicate {

    public boolean hasDuplicateCharacters(String text) {
        if (text == null || text.length() <= 1)
            return false;
        HashSet<Character> alphaSet = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            alphaSet.add(text.charAt(i));
        }

        return text.length() != alphaSet.size();
    }

    public String findDuplicateCharacters(String word) {
        if (word == null || word.length() <= 1)
            return "";
        String result = "";
        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(characters.containsKey(c))
                characters.put(c, characters.get(c) + 1);
            else
                characters.put(c, 1);
        }

        for(Character ca: characters.keySet()) {
            if(characters.get(ca) > 1)
                result += ca + "\n";

        }
        return result;
    }


}
