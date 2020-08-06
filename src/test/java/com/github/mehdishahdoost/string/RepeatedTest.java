package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class RepeatedTest {

    @Test
    public void repeatedCharTest() {
        Repeated repeated = new Repeated();
        Character firstR = repeated.findNonRepeatedChar("mehdi");
        Character secondR = repeated.findNonRepeatedChar("easiest");
        Assertions.assertEquals(firstR, 'm');
        Assertions.assertEquals(secondR, 'a');
    }

    @Test
    public void repeatedCharUsingIndexOfTest() {
        Repeated repeated = new Repeated();
        Character firstR = repeated.findFirstNonRepeatedChar("mehdi");
        Character secondR = repeated.findFirstNonRepeatedChar("easiest");
        Assertions.assertEquals(firstR, 'm');
        Assertions.assertEquals(secondR, 'a');
    }
}
