package com.github.mehdishahdoost.math.gcd;

/**
 *  GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers
 * is the largest number that divides both of them.
 * @author Mehdi Shahdoost
 */
class KGCD {

  fun gcd(a: Int, b: Int): Int {
    if (b == 0)
      return a
    return gcd(b, a % b)
  }
}
