package com.tom.test;

import java.util.Arrays;

public class Task3 {
    /**
     * A function that takes an array of numbers and returns the sum of the numbers.
     */
    public static double sumArray(double[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        return Arrays.stream(numbers).sum();
    }
}
