package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class AnagramTest {

    @Test
    public void anagramUsingStringMethodsTest() {
        Anagram anagram = new Anagram();
        boolean anagramUsingStringMethods = anagram.isAnagramUsingStringMethods("angel", "angle");
        boolean anagramUsingStringMethods2 = anagram.isAnagramUsingStringMethods("angel", "anglr");
        Assertions.assertTrue(anagramUsingStringMethods);
        Assertions.assertFalse(anagramUsingStringMethods2);
    }

    @Test
    public void anagramUsingSortTest() {
        Anagram anagram = new Anagram();
        boolean anagramUsingStringMethods = anagram.isAnagramUsingSort("angel", "angle");
        boolean anagramUsingStringMethods2 = anagram.isAnagramUsingSort("angel", "anglr");
        Assertions.assertTrue(anagramUsingStringMethods);
        Assertions.assertFalse(anagramUsingStringMethods2);
    }


}
