package com.github.mehdishahdoost.string;

/**
 * @author Mehdi Shahdoost
 */
public class Reverse {

    /**
     * Reverses a string by recursive function
     */
    public String reverseWithRecursive(String text) {
        if (text.length() == 1)
            return text;
        return text.charAt(text.length() - 1) + reverseWithRecursive(text.substring(0, text.length() - 1));
    }

    /**
     * Reverses a string by for-loop
     */
    public String reverseWithForLoop(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    /**
     * Reverses a string by builtin java StringBuffer class.
     */
    public String reverse(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
