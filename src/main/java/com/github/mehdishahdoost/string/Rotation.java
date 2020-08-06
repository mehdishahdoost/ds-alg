package com.github.mehdishahdoost.string;

/**
 * How to check if one String is rotation of another String
 * <p>
 * example:
 * <p>
 * MyHome ---> HomeMy
 * JavaBook ---> BookJava
 *
 * @author Mehdi Shahdoost
 */
public class Rotation {

    public boolean isRotation(String word1, String word2) {
        String word3 = word1 + word1;
        if (word3.contains(word2))
            return true;
        return false;
    }

}
