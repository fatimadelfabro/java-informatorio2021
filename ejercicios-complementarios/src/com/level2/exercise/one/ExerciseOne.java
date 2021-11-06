package com.level2.exercise.one;
import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseOne {
    public static void main (String [] args){
        ArrayList<String> city = new ArrayList<>();
        char flag = 's';
        while (flag == 's' || flag == 'S'){
            Scanner sc = new  Scanner(System.in);
            System.out.println("Enter your favorite city");
            city.add(sc.nextLine());
            System.out.println("¿Do you wish to continue? S/N");
            flag = sc.next().charAt(0);
            sc = null;
            }

        for (int i = 0; i < city.size(); i++) {
            System.out.println((i+1) + "# " + city.get(i));
        }
    }
}