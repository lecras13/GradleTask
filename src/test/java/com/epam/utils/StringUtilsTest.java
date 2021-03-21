package com.epam.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtilsTest {

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("5", true),
                Arguments.of("", false),
                Arguments.of("-5", false),
                Arguments.of("not blank", false),
                Arguments.of("0", false),
                Arguments.of("-100000", false),
                Arguments.of("1000000000000000", true),
                Arguments.of("10.00000000000000", true),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideStrings")
    public void testIsPositiveNumber(String str, boolean expected) {
        boolean actual = StringUtils.isPositiveNumber(str);

        assertEquals(expected, actual);
    }
}
