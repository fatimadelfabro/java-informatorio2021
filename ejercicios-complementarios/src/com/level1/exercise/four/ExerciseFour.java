package com.level1.exercise.four;

import java.util.Scanner;

public class ExerciseFour {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numbers");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
