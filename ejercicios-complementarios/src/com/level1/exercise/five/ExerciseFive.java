package com.level1.exercise.five;
import java.util.Scanner;

public class ExerciseFive {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        System.out.println("Number one");
        int num1 = sc.nextInt();
        System.out.println("Number two");
        int num2 = sc.nextInt();
        int accountant = 0;
        for (int i = 0; i < num2; i++){
            accountant += num1;
        }
        System.out.println(String.format("%d * %d = %d", num1, num2, accountant));
    }
}
