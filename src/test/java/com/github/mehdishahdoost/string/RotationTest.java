package com.github.mehdishahdoost.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mehdi Shahdoost
 */
public class RotationTest {

    @Test
    public void rotationTest() {
        Rotation rotation = new Rotation();
        boolean rotation1 = rotation.isRotation("JavaBook", "BookJava");
        boolean rotation2 = rotation.isRotation("JavaBook", "BookAjava");
        Assertions.assertTrue(rotation1);
        Assertions.assertFalse(rotation2);
    }
}
