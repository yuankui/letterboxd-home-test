package com.tom.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void shouldThrowExceptionForNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> Task2.calculateCircleArea(-1));
    }

    @Test
    void shouldCalculateAreaOfCircle() {
        assertEquals(Math.PI * 4, Task2.calculateCircleArea(2), 0.0001);
    }
}