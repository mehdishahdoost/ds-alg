package com.github.mehdishahdoost.math.gcd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GCDTest {

    @Test
    public void gcd() {
        GCD gcd = new GCD();
        int result = gcd.gcd(12, 4);
        Assertions.assertEquals(result, 4);
    }

    @Test
    public void kgcd() {
        KGCD kgcd = new KGCD();
        int result = kgcd.gcd(12, 4);
        Assertions.assertEquals(result, 4);
    }
}
