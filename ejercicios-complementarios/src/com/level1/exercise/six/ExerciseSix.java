package com.level1.exercise.six;
import java.util.Scanner;

public class ExerciseSix {
    public static void main (String [] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        System.out.println("Base");
        num1 = sc.nextInt();
        System.out.println("Exponent");
        num2 = sc.nextInt();
        System.out.println(String.format("%d to the power of %d is = %d",num1, num2, power(num1, num2)));
    }
    public static int power(int x, int y){
        int pow = x;
        for (int i = 1; i < y; i++) {
            pow *= x;
        }
        return pow;
    }
}
