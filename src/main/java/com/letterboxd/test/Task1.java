package com.letterboxd.test;

public class Task1 {
    /**
     * A function that returns true if the first letter of a string is uppercase.
     */
    public static boolean isFirstLetterUppercase(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char firstChar = str.charAt(0);
        return Character.isUpperCase(firstChar);
    }
}
