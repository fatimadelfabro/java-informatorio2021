package com.level1.exercise.two;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main (String [] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        System.out.println("Number one");
        num1 = sc.nextInt();
        System.out.println("Number two");
        num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(String.format("%d + %d = %d", num1, num2, sum));

        int subtraction = num1 - num2;
        System.out.println(String.format("%d - %d = %d", num1, num2, subtraction));

        int multiplication = num1 * num2;
        System.out.println(String.format("%d * %d = %d", num1, num2, multiplication));

        int division = num1 / num2;
        System.out.println(String.format("%d / %d = %d", num1, num2, division));

        int module = num1 % num2;
        System.out.println(String.format("%d %% %d = %d", num1, num2, module));

    }
}
