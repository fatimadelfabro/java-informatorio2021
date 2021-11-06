package com.level1.exercise.seven;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String txt = sc.nextLine();
        char strArr[] = txt.toCharArray();

        for (int i = 0; i < strArr.length; i++){
            if (strArr[i] >= 'a' && strArr[i] <= 'z') strArr[i] = (char) ((int) strArr[i] - 32);
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}
