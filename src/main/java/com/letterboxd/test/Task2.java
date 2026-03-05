package com.letterboxd.test;

public class Task2 {
    /**
     * A function to take a radius and return the area of a circle with that radius.
     */
    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
