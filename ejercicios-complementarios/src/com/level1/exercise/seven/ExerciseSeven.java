package com.level1.exercise.seven;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");

        String txt = sc.nextLine();

        for (int i = 0; i< txt.length(); i++){

            char lower ;
            if('A' <= txt.charAt(i) && txt.charAt(i) <= 'Z'){
                lower = (char)( (txt.charAt(i) + 32) );
                System.out.print(lower);
            }else{
                lower = txt.charAt(i);
                System.out.print(lower);
            }

        }

    }
}
