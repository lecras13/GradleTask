package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testIsPositiveNumberGiveTrue() {
        boolean actual = StringUtils.isPositiveNumber("5");

        assertTrue(actual);
    }

    @Test
    public void testIsPositiveNumberGiveFalse() {
        boolean actual = StringUtils.isPositiveNumber("-5");

        assertFalse(actual);
    }
}
