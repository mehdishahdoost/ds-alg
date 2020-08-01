package com.github.mehdishahdoost.math.gcd;

/**
 * GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers
 * is the largest number that divides both of them.
 * 
 * @author Mehdi Shahdoost
 */
public class GCD {

    /**
     * An efficient solution is to use Euclidean algorithm which is the main
     * algorithm used for this purpose.
     * 
     */
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}