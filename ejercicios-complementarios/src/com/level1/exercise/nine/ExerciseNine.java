package com.level1.exercise.nine;

import java.util.Scanner;

public class ExerciseNine {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String txt = sc.nextLine();
        System.out.println("¿What character do you want to find in the text?");
        char x = sc.next().charAt(0);
        char temp;
        int accumulator = 0;

        for (int i = 0; i < txt.length(); i++){
            temp = txt.charAt(i);
            if (temp == x){
                accumulator ++;
            }
        }
        System.out.println( "(" + x + ")" + " appears " + accumulator + " times in text");
    }
}
