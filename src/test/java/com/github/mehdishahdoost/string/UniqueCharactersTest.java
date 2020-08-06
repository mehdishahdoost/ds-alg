package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class UniqueCharactersTest {

    @Test
    public void uniqueCharTest() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        boolean unique = uniqueCharacters.isUniqueChar("mehdi");
        boolean notUnique = uniqueCharacters.isUniqueChar("yellow");
        Assertions.assertTrue(unique);
        Assertions.assertFalse(notUnique);
    }


    @Test
    public void uniqueCharUsingIndexOfTest() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        boolean unique = uniqueCharacters.isUniqueCharUsingIndexOf("mehdi");
        boolean notUnique = uniqueCharacters.isUniqueCharUsingIndexOf("yellow");
        Assertions.assertTrue(unique);
        Assertions.assertFalse(notUnique);
    }
}
