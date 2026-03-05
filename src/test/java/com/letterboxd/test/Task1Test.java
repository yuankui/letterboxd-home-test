package com.letterboxd.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void shouldReturnFalseIfNull() {
        assertFalse(Task1.isFirstLetterUppercase(null));
    }

    @Test
    void shouldReturnFalseIfEmpty() {
        assertFalse(Task1.isFirstLetterUppercase(""));
    }

    @Test
    void shouldReturnTrueIfFirstLetterIsUppercase() {
        assertTrue(Task1.isFirstLetterUppercase("Hello"));
    }

    @Test
    void shouldReturnFalseIfFirstLetterIsLowercase() {
        assertFalse(Task1.isFirstLetterUppercase("hello"));
    }

    @Test
    void shouldReturnFalseIfFirstLetterIsNotLetter() {
        assertFalse(Task1.isFirstLetterUppercase("123"));
    }
}