package com.tom.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task3Test {
    @Test
    void shouldThrowExceptionForNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Task3.sumArray(null));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        assertEquals(0, Task3.sumArray(new double[]{}));
    }

    @Test
    void shouldSumArrayElements() {
        assertEquals(6, Task3.sumArray(new double[]{1, 2, 3}));
    }
}
