package com.tom.test.feedback;

import java.util.ArrayList;

public class Task3 {

    static ArrayList<int[]> tests = new ArrayList<int[]>();

    static int[] test1 = {0, 3, 5, 6, 7} ;
    static int[] test2 = {6, 23, 55, 8, 9};
    static int[] test3 = {4, 5, 6, 8, 12, 34};

    public static void setUp () {
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
    }
    
    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        setUp();
        for (int i = 0; i < tests.size(); i++) {
            int[] test = tests.get(i);
            System.out.println("The sum of the array is: " + getSum(test));
        }
    }
}
