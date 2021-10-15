package com.level1.exercise.one;

import java.util.Scanner;

public class ExerciseOne {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("¿What's your name?");
        name = sc.nextLine();

        System.out.println("HELLO " + name + " !!!");
    }
}
