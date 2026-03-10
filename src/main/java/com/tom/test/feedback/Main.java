package com.tom.test.feedback;

import java.util.Arrays;
import java.util.List;


public class Main {

    private static boolean task1(String input) {
        boolean result = false;
        if(input !=null && !input.isEmpty()) {
            char firstLetter  = input.charAt(0);
            if (firstLetter >='A' && firstLetter <='Z') {
                result = true;
            }
        }
        return result;
    }

    private static double task2(double radius) {
        double area =  Math.PI * radius*radius;
        if (Double.isInfinite(area)) {
            System.out.println("The result exceeds the maximum value of double.");
//            throw new ArithmeticException("The result exceeds the maximum value of double.");
        }
        return area;
    }

    private static Integer task3(List<Integer> input){
        Integer sum = input.stream().reduce(0,(a,b) -> a + b);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("==========Task1==========");
        System.out.println(task1("adb"));
        System.out.println(task1("Zadbe"));
        System.out.println(task1("Hbd"));
        System.out.println(task1("Abd"));
        System.out.println(task1("cbd"));
        System.out.println(task1("1bd"));
        System.out.println(task1("$bd"));
        System.out.println(task1("‘bd"));
        System.out.println(task1(null));
        System.out.println(task1(""));
        System.out.println("");

        System.out.println("==========Task2==========");
        System.out.println(task2(3));
        System.out.println(task2(12345.3343));
        System.out.println(task2(0));
        System.out.println(task2(Double.MAX_VALUE));
        System.out.println("");

        System.out.println("==========Task3==========");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(task3(integers));


        /*
        Task1:
            Completion time: 12 minutes
            Relevant URLs:
                https://stackoverflow.com/questions/8962025/java-program-to-test-if-a-character-is-uppercase-lowercase-number-vowel
                https://www.w3schools.com/java/ref_string_charat.asp

        Task2:
            Completion time: 20 minutes
            Relevant URLs:
                https://stackoverflow.com/questions/69426960/how-to-detect-and-prevent-integer-overflow-when-multiplying-an-integer-by-float
                https://www.baeldung.com/java-overflow-underflow
                https://stackoverflow.com/questions/31974837/can-doubles-or-bigdecimal-overflow
            Remark:
                The exception handling for calculation overflow has been temporarily commented out, but in formal projects,
                I usually handle runtime exceptions by throwing them. Once an exception is thrown,
                it is caught globally to enable the corresponding user interaction.

        Task3
            Completion time: 6 minutes
            Relevant URLs:
                https://www.baeldung.com/java-stream-sum

         */

    }
}

