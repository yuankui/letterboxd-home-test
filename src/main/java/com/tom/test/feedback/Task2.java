package com.tom.test.feedback;

public class Task2 {
    
    static double[] tests = {2, 4, 6 ,100, 5};

    final static double pi = 3.14159265359;
    
    public static double getArea(double radius) {
        double area = pi * radius * radius;
        return area;
    }

    public static void call(double radius) {
        double area = getArea(radius);
        System.out.println("Th area of a circle of radius " + radius + "is: " + area);
    }

    public static void main(String[] args) {
        for (int i = 0; i < tests.length; i++) {
            call(tests[i]);
        }
    }
}
