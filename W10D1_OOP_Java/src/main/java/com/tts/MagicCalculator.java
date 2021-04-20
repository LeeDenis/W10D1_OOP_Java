package com.tts;

public class MagicCalculator {

    public static void sqrt(double num1) {
        double root = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + " is " + root + ".");
    }

    public static void sin(double num1) {
        double sin = Math.sin(num1);
        System.out.println("The sine of " + num1 + " is " + sin + ".");
    }

    public static void cos(double num1) {
        double cos = Math.cos(num1);
        System.out.println("The cosine of " + num1 + " is " + cos + ".");
    }

    public static void tan(double num1) {
        double tan = Math.tan(num1);
        System.out.println("The tangent of " + num1 + " is " + tan + ".");
    }

    public static void factorial(double num1) {
        double factorial = 1;
        if (num1 == 0 || num1 == 1) {
            factorial = 1;
        } else {
            for (var i = num1; i > 1; i--) {
                factorial = factorial * i;
            }
        System.out.println("The factorial of " + num1 + " is " + factorial + ".");
        }
    }
}
