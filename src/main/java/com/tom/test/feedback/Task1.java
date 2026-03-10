package com.tom.test.feedback;

public class Task1 {

    static String[] tests = {"Cat", "dog", "emU", "ostriCH", "eLEPHAnt", "ARMY"};
    
    public static boolean firstLetterIsUpperCase(String string) {
        char firstLetter = string.charAt(0);
        if (Character.isUpperCase(firstLetter)) {
            return true;
        }
        return false;
    }

    public static void call(String string) {
        boolean isTrue = firstLetterIsUpperCase(string);
        if (isTrue) {
            System.out.println("It is true that " + string + " has the first letter capitalised.");
        } else {
            System.out.println("It is false that " + string + " has the first letter capitalised.");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < tests.length; i++) {
            call(tests[i]);
        }
    }
}


